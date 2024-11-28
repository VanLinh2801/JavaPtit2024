package src.backend.users;

import java.sql.*;

import src.backend.databaseConnector;

public class UsersDAO {
    public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM Users WHERE username = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet = preparedStatement.executeQuery();
        boolean result = resultSet.next();
        if (result) {
            String lastLoginQuery = "INSERT INTO LastLogin (loginTime, UserId) VALUES (?, ?)";
            PreparedStatement lastLoginStatement = connection.prepareStatement(lastLoginQuery);
            lastLoginStatement.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            lastLoginStatement.setInt(2, resultSet.getInt("id"));
            lastLoginStatement.executeUpdate();
        }
        connection.close();
        return result;
    }

    public Users getProfile() throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM LastLogin WHERE loginTime = (SELECT MAX(loginTime) FROM LastLogin)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int userId = resultSet.getInt("UserId");
            String profileQuery = "SELECT * FROM Users WHERE id = ?";
            PreparedStatement profileStatement = connection.prepareStatement(profileQuery);
            profileStatement.setInt(1, userId);
            ResultSet profileResultSet = profileStatement.executeQuery();
            while (profileResultSet.next()) {
                int id = profileResultSet.getInt("id");
                String userName = profileResultSet.getString("username");
                String password = profileResultSet.getString("password");
                String fullName = profileResultSet.getString("fullName");
                String gender = profileResultSet.getString("gender");
                String phoneNumber = profileResultSet.getString("phoneNumber");
                int workShift = profileResultSet.getInt("workShift");
                Users user = new Users(id, userName, password, fullName, gender, phoneNumber,
                        workShift);
                connection.close();
                return user;
            }
        }
        return null;

    }

    public boolean addSecurityGuard(Users user) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "INSERT INTO Users (username, password, fullName, gender, phoneNumber, workShift,roleId) VALUES (?, ?, ?, ?, ?, ?,2)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, user.getUserName());
        preparedStatement.setString(2, user.getPassword());
        preparedStatement.setString(3, user.getFullName());
        preparedStatement.setString(4, user.getGender());
        preparedStatement.setString(5, user.getPhoneNumber());
        preparedStatement.setInt(6, user.getShift());
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

    public boolean removeSecurityGuard(int id) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "DELETE FROM Users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

}