package src.backend.ticket;

import java.sql.*;

import src.backend.databaseConnector;

public class TicketDAO {
    public void addTicket(Ticket ticket) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "INSERT INTO Ticket (loaive, giovao, giora, gia) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, ticket.getLoaive());
        preparedStatement.setTimestamp(2, new Timestamp(ticket.getGiovao().getTime()));
        preparedStatement.setTimestamp(3, new Timestamp(ticket.getGiora().getTime()));
        preparedStatement.setDouble(4, ticket.getGia());
        preparedStatement.executeUpdate();
        connection.close();
    }

}
