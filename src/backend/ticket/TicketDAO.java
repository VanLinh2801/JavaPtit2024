package src.backend.ticket;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

import java.time.temporal.ChronoUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TicketDAO {

    // Connection con = databaseConnector.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

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

    public boolean isPlateNumberExist(String bienSo) throws SQLException, ClassNotFoundException {
        String query = "SELECT 1 FROM Ticket WHERE plateNumber = ? AND ticketType = 'MONTHLY'";
        try (
                Connection connection = databaseConnector.getConnection();
                PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, bienSo);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TicketDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        String findTicket = "SELECT * FROM Ticket WHERE entryTime = (SELECT MAX(entryTime) FROM Ticket WHERE plateNumber = ?) AND ticketType = ?";
        PreparedStatement findTicketStatement = connection.prepareStatement(findTicket);
        findTicketStatement.setString(1, plateNumber);
        findTicketStatement.setString(2, ticketTypeEnum.DAILY.toString());
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

    public boolean deleteOneTicket(int id) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "DELETE FROM Ticket WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

    public boolean deleteManyTickets(List<Integer> idToDeleteList) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "DELETE FROM Ticket WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        for (int id : idToDeleteList) {
            preparedStatement.setInt(1, id);
            preparedStatement.addBatch();
        }
        int[] results = preparedStatement.executeBatch();
        connection.close();
        for (int result : results) {
            if (result <= 0) {
                return false;
            }
        }
        return true;
    }

    public List<Ticket> getManyTickets(String plateNumber, ticketTypeEnum ticketType, vehicleTypeEnum vehicleType,
            Date startTimeFilter,
            Date endTimeFilter) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();

        // Base query
        StringBuilder queryBuilder = new StringBuilder("SELECT * FROM Ticket WHERE 1=1");

        // Add filters conditionally
        List<Object> parameters = new ArrayList<>();
        if (plateNumber != null && !plateNumber.isEmpty()) {
            queryBuilder.append(" AND plateNumber = ?");
            parameters.add(plateNumber);
        }
        if (vehicleType != null) {
            queryBuilder.append(" AND vehicleType = ?");
            parameters.add(vehicleType.toString());
        }
        if (startTimeFilter != null) {
            queryBuilder.append(" AND entryTime >= ?");
            parameters.add(startTimeFilter);
        }
        if (endTimeFilter != null) {
            queryBuilder.append(" AND entryTime <= ?");
            parameters.add(endTimeFilter);
        }

        if (ticketType != null) {
            queryBuilder.append(" AND ticketType = ?");
            parameters.add(ticketType.toString());
        }

        // Prepare the statement with the dynamically built query
        String query = queryBuilder.toString();
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // Set parameters dynamically
        for (int i = 0; i < parameters.size(); i++) {
            preparedStatement.setObject(i + 1, parameters.get(i));
        }

        // Execute the query and process the result set
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Ticket> tickets = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            ticketTypeEnum ticketTypeResult = ticketTypeEnum.valueOf(resultSet.getString("ticketType"));
            Date entryTime = resultSet.getDate("entryTime");
            Date exitTime = resultSet.getDate("exitTime");
            double price = resultSet.getDouble("price");
            String plateNumberResult = resultSet.getString("plateNumber");
            vehicleTypeEnum vehicleTypeResult = vehicleTypeEnum.valueOf(resultSet.getString("vehicleType"));
            int userId = resultSet.getInt("UserId");
            Ticket ticket = new Ticket(id, ticketTypeResult, entryTime, exitTime, price, plateNumberResult,
                    vehicleTypeResult,
                    userId);
            tickets.add(ticket);
        }

        connection.close();
        return tickets;
    }

    public boolean extendMonthlyTicket(String plateNumber) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String findTicket = "SELECT * FROM Ticket WHERE entryTime = (SELECT MAX(entryTime) FROM Ticket WHERE plateNumber = ?) AND ticketType = ?";
        PreparedStatement findTicketStatement = connection.prepareStatement(findTicket);
        findTicketStatement.setString(1, plateNumber);
        findTicketStatement.setString(2, ticketTypeEnum.MONTHLY.toString());
        ResultSet findTicketResultSet = findTicketStatement.executeQuery();
        while (findTicketResultSet.next()) {
            Timestamp entryTime = new Timestamp(System.currentTimeMillis());
            Timestamp exitTime = new Timestamp(
                    entryTime.toLocalDateTime().plus(30, ChronoUnit.DAYS).toEpochSecond(ZoneOffset.UTC));
            String extendMonthlyTicket = "UPDATE Ticket SET entryTime = ?, exitTime = ? WHERE entryTime = (SELECT MAX(entryTime) FROM Ticket WHERE plateNumber = ?)";
            PreparedStatement extendMonthlyTicketStatement = connection.prepareStatement(extendMonthlyTicket);
            extendMonthlyTicketStatement.setTimestamp(1, entryTime);
            extendMonthlyTicketStatement.setTimestamp(2, exitTime);
            extendMonthlyTicketStatement.setString(3, plateNumber);
            int result = extendMonthlyTicketStatement.executeUpdate();
            connection.close();
            return result > 0;

        }
        return false;

    }

    // public void searchTicket(JTable table, String bienSo, ){
    // String sql = "select username, fullName, phoneNumber, roleId, workShift from
    // users where concat(username, fullname, phoneNumber) like ? and RoleId = 2";
    // try {
    // ps = con.prepareStatement(sql);
    // ps.setString(1, "%" + search + "%");
    // rs = ps.executeQuery();
    // DefaultTableModel model = (DefaultTableModel) table.getModel();
    // Object[] row;
    // while(rs.next()){
    // row = new Object[6];
    // row[0] = false;
    // row[1] = rs.getString(1);
    // row[2] = rs.getString(2);
    // row[3] = rs.getString(3);
    // row[4] = "Bảo vệ";
    // int shift = rs.getInt(5);
    // if(shift == 1) row[5] = "Sáng";
    // else row[5] = "Tối";
    // model.addRow(row);
    // }
    // } catch (SQLException ex) {
    // Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
    // }
    // }

}
