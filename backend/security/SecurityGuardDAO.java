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

    public void getProfile(int id) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM SecurityGuards WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            System.out.println("Name: " + resultSet.getString("phoneNumber"));
        }
    }

    public void updateUsername(int id, String username) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE SecurityGuards SET username = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public boolean updatePassword(int id, String oldPassword, String newPassword)
            throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT password FROM SecurityGuards WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            if (resultSet.getString("password").equals(oldPassword)) {
                query = "UPDATE SecurityGuards SET password = ? WHERE id = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, newPassword);
                preparedStatement.setInt(2, id);
                preparedStatement.executeUpdate();
                return true;
            }
        }
        return false;
    }

    public void updatePhoneNumber(int id, String phoneNumber) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE SecurityGuards SET phoneNumber = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, phoneNumber);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public void updateShift(int id, int shift) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE SecurityGuards SET shift = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, shift);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public void updateGender(int id, String gender) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE SecurityGuards SET gender = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, gender);
        preparedStatement.setInt(2, id);
        preparedStatement.executeUpdate();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        SecurityGuardDAO securityGuardDAO = new SecurityGuardDAO();
        try {
            System.out.println(securityGuardDAO.login("admin", "Abc@12345"));
            securityGuardDAO.updatePassword(1, "Abc@12345", "null");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}