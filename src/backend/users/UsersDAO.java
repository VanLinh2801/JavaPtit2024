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
        String query = "SELECT UserId FROM lastLogin WHERE loginTime = (SELECT MAX(loginTime) FROM lastLogin)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        int userId = resultSet.getInt("UserId");
        String profileQuery = "SELECT * FROM Users WHERE id = ?";
        PreparedStatement profileStatement = connection.prepareStatement(profileQuery);
        profileStatement.setInt(1, userId);
        ResultSet profileResultSet = profileStatement.executeQuery();
        Users user = new Users(profileResultSet.getInt("id"), profileResultSet.getString("username"),
                profileResultSet.getString("password"), profileResultSet.getString("fullName"),
                profileResultSet.getString("gender"), profileResultSet.getString("phoneNumber"),
                profileResultSet.getInt("shift"));
        return user;
    }

    public boolean addSecurityGuard(Users user) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "INSERT INTO Users (username, password, fullName, gender, phoneNumber, shift,roleId) VALUES (?, ?, ?, ?, ?, ?,2)";
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

    public static void main(String[] args) {
        UsersDAO usersDAO = new UsersDAO();
        try {
            System.out.println(usersDAO.login("admin", "admin"));
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}