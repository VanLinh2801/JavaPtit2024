package src.backend.ticket;

import java.sql.*;
import java.time.*;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class TicketDAO {

    public boolean addDailyTicket(Ticket ticket) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String currentUserId = "SELECT * FROM LastLogin WHERE loginTime = (SELECT MAX(loginTime) FROM LastLogin)";
        PreparedStatement currentUserIdStatement = connection.prepareStatement(currentUserId);
        ResultSet currentUserIdResultSet = currentUserIdStatement.executeQuery();
        while (currentUserIdResultSet.next()) {
            int userId = currentUserIdResultSet.getInt("UserId");
            String query = "INSERT INTO Ticket (ticketType, entryTime, plateNumber,vehicleType, UserId) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, ticketTypeEnum.DAILY.toString());
            preparedStatement.setTimestamp(2, new Timestamp(System.currentTimeMillis()));
            preparedStatement.setString(3, ticket.getPlateNumber());
            preparedStatement.setString(4, ticket.getVehicleType().toString());
            preparedStatement.setInt(5, userId);
            int result = preparedStatement.executeUpdate();
            connection.close();
            return result > 0;
        }
        connection.close();
        return false;
    }

    public boolean addAndCalculatePriceForMonthlyTicket(Ticket ticket) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String currentUserIdQuery = "SELECT * FROM LastLogin WHERE loginTime = (SELECT MAX(loginTime) FROM LastLogin)";
        PreparedStatement currentUserIdStatement = connection.prepareStatement(currentUserIdQuery);
        ResultSet currentUserIdResultSet = currentUserIdStatement.executeQuery();

        if (currentUserIdResultSet.next()) {
            int userId = currentUserIdResultSet.getInt("UserId");
            String vehicleType = ticket.getVehicleType().toString();

            String vehiclePriceQuery = "SELECT * FROM VehiclePrice WHERE vehicleType = ?";
            PreparedStatement vehiclePriceStatement = connection.prepareStatement(vehiclePriceQuery);
            vehiclePriceStatement.setString(1, vehicleType);
            ResultSet vehiclePriceResultSet = vehiclePriceStatement.executeQuery();

            if (vehiclePriceResultSet.next()) {
                double monthlyPrice = vehiclePriceResultSet.getDouble("monthlyPrice");

                // Get the current time for entryTime
                LocalDateTime entryTime = LocalDateTime.now();
                // Add 30 days to entryTime for exitTime
                LocalDateTime exitTime = entryTime.plus(30, ChronoUnit.DAYS);

                // Convert to Timestamp for database insertion
                Timestamp entryTimestamp = Timestamp.valueOf(entryTime);
                Timestamp exitTimestamp = Timestamp.valueOf(exitTime);

                String insertTicketQuery = "INSERT INTO Ticket (ticketType, entryTime, exitTime, plateNumber, vehicleType, UserId, price) VALUES (?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(insertTicketQuery);
                preparedStatement.setString(1, ticketTypeEnum.MONTHLY.toString());
                preparedStatement.setTimestamp(2, entryTimestamp);
                preparedStatement.setTimestamp(3, exitTimestamp);
                preparedStatement.setString(4, ticket.getPlateNumber());
                preparedStatement.setString(5, ticket.getVehicleType().toString());
                preparedStatement.setInt(6, userId);
                preparedStatement.setDouble(7, monthlyPrice);

                int result = preparedStatement.executeUpdate();

                connection.close();
                return result > 0;
            }
        }

        connection.close();
        return false;
    }

    public boolean calculateDailyPrice(String plateNumber) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String findTicket = "SELECT * FROM Ticket WHERE entryTime = (SELECT MAX(entryTime) FROM Ticket WHERE plateNumber = ?)";
        PreparedStatement findTicketStatement = connection.prepareStatement(findTicket);
        findTicketStatement.setString(1, plateNumber);
        ResultSet findTicketResultSet = findTicketStatement.executeQuery();
        while (findTicketResultSet.next()) {
            Timestamp entryTime = findTicketResultSet.getTimestamp("entryTime");
            Timestamp exitTime = new Timestamp(System.currentTimeMillis());
            Double totalPrice = 0.0;
            String vehicleType = findTicketResultSet.getString("vehicleType");
            String vehiclePrice = "SELECT * FROM VehiclePrice WHERE vehicleType = ?";
            PreparedStatement vehiclePriceStatement = connection.prepareStatement(vehiclePrice);
            vehiclePriceStatement.setString(1, vehicleType);
            ResultSet vehiclePriceResultSet = vehiclePriceStatement.executeQuery();
            while (vehiclePriceResultSet.next()) {
                double morningPrice = vehiclePriceResultSet.getDouble("morningPrice");
                double afternoonPrice = vehiclePriceResultSet.getDouble("afternoonPrice");
                double nightPrice = vehiclePriceResultSet.getDouble("nightPrice");
                LocalDate entryLocalDate = entryTime.toLocalDateTime().toLocalDate();
                LocalDate exitLocalDate = exitTime.toLocalDateTime().toLocalDate();
                long diff = exitLocalDate.toEpochDay() - entryLocalDate.toEpochDay();
                double priceByDay = 0.0;
                int exitHour = exitTime.toLocalDateTime().getHour();
                if (exitHour >= 6 && exitHour < 18) {
                    priceByDay = morningPrice;
                } else if (exitHour >= 18 && exitHour < 23) {
                    priceByDay = afternoonPrice;
                } else {
                    priceByDay = nightPrice;
                }
                totalPrice = nightPrice * diff + priceByDay;

                String updateTicket = "UPDATE Ticket SET exitTime = ?, price = ? WHERE entryTime = (SELECT MAX(entryTime) FROM Ticket WHERE plateNumber = ?)";
                PreparedStatement updateTicketStatement = connection.prepareStatement(updateTicket);
                updateTicketStatement.setTimestamp(1, exitTime);
                updateTicketStatement.setDouble(2, totalPrice);
                updateTicketStatement.setString(3, plateNumber);
                int result = updateTicketStatement.executeUpdate();
                connection.close();
                return result > 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TicketDAO ticketDAO = new TicketDAO();
        try {
            Ticket ticket = new Ticket("29U2 497-92", vehicleTypeEnum.MOTORBIKE);
            ticketDAO.addAndCalculatePriceForMonthlyTicket(ticket);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
