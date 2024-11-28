package src.backend.security;

import java.sql.*;

import src.backend.databaseConnector;

public class SecurityGuardDAO {
    public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM SecurityGuards WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        return resultSet.next();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        SecurityGuardDAO securityGuardDAO = new SecurityGuardDAO();
        try {
            System.out.println(securityGuardDAO.login("admin", "Abc@12345"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}