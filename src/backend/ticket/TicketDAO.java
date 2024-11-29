package src.backend.ticket;

import java.sql.*;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

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
            preparedStatement.setTimestamp(2, new Timestamp(ticket.getEntryTime().getTime()));
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

    // public boolean updateTicket(int id) throws SQLException,
    // ClassNotFoundException {
    // Connection connection = databaseConnector.getConnection();
    // String query = "UPDATE Ticket SET exitTime = ?, price = ? WHERE id = ?";
    // PreparedStatement preparedStatement = connection.prepareStatement(query);
    // preparedStatement.setTimestamp(1, new
    // Timestamp(ticket.getExitTime().getTime()));
    // preparedStatement.setDouble(2, ticket.getPrice());
    // preparedStatement.setInt(3, id);
    // int result = preparedStatement.executeUpdate();
    // connection.close();
    // return result > 0;
    // }

    // public static void main(String[] args) {
    // TicketDAO ticketDAO = new TicketDAO();

    // }
}
