package Dao;

import java.sql.*;

import connection.databaseConnector;
import enums.roleEnum;
import Dao.Users;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class UserDAO {
    Connection con = databaseConnector.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;

    public static boolean login(String username, String password) throws SQLException, ClassNotFoundException {
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

    public static Users getProfile() throws SQLException, ClassNotFoundException {
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

    public static boolean addSecurityGuard(Users user) throws SQLException, ClassNotFoundException {
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

    public static int getUserId(String username) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "Select id fro users where username = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, username);
        ResultSet rs = preparedStatement.executeQuery();
        if(rs.next()) return rs.getInt(1);
        connection.close();
        return 0;
    }

    public void getUsersValue(JTable table, String search){
        String sql = "select username, fullName, phoneNumber, roleId, workShift from users where concat(username, fullname, phoneNumber) like ? and RoleId = 2";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + search + "%");
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while(rs.next()){
                row = new Object[6];
                row[0] = false;
                row[1] = rs.getString(1);
                row[2] = rs.getString(2);
                row[3] = rs.getString(3);
                row[4] = "Bảo vệ";
                int shift = rs.getInt(5);
                if(shift == 1) row[5] = "Sáng";
                else row[5] = "Tối";
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean removeSecurityGuard(int id) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String checkPermission = "SELECT r.roleName FROM Users u JOIN [Role] r ON r.id = u.roleId JOIN LastLogin ll ON ll.UserId = u.id WHERE ll.loginTime = (SELECT MAX(loginTime) FROM LastLogin) GROUP BY r.roleName";
        PreparedStatement checkPermissionStatement = connection.prepareStatement(checkPermission);
        ResultSet resultSet = checkPermissionStatement.executeQuery();
        if (!resultSet.next() || !resultSet.getString("roleName").equals(roleEnum.ADMIN.toString())) {
            connection.close();
            return false;
        }
        String query = "DELETE FROM Users WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

    public static boolean changePassword(int id, String oldPassword, String newPassword)
            throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE Users SET password = ? WHERE id = ? AND password = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, newPassword);
        preparedStatement.setInt(2, id);
        preparedStatement.setString(3, oldPassword);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

    public static String getPassword(int id){
        Connection connection = databaseConnector.getConnection();
        ResultSet result;
        String res = "";
        String query = "Select password from users where id = ?";
        PreparedStatement preparedStatement;
        try {
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();
            if(result.next()) res = result.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

    public static boolean isPhoneExist(String phone, int id){
        try {
            Connection connection = databaseConnector.getConnection();
            String query = "Select * from users where phonenumber = ? and id != ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, phone);
            preparedStatement.setInt(2, id);
            ResultSet result = preparedStatement.executeQuery();
            if(result.next()) return true;
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static boolean isUsernameExist(String username){
        try {
            Connection connection = databaseConnector.getConnection();
            String query = "Select * from users where username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, username);
            ResultSet result = preparedStatement.executeQuery();
            if(result.next()) return true;
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static void updateUser(Users user) throws SQLException {
        String currentUserQuery = "SELECT * FROM LastLogin WHERE loginTime = (SELECT MAX(loginTime) FROM LastLogin)";
        String updateQuery = "UPDATE Users SET username = ?, fullName = ?, gender = ?, phoneNumber = ?, workShift = ? WHERE id = ?";

        try (Connection connection = databaseConnector.getConnection();
             PreparedStatement currentUserStatement = connection.prepareStatement(currentUserQuery);
             ResultSet currentUserResultSet = currentUserStatement.executeQuery()) {

            if (currentUserResultSet.next()) {
                int userId = currentUserResultSet.getInt("UserId");

                try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
                    preparedStatement.setString(1, user.getUserName());
                    preparedStatement.setString(2, user.getFullName());
                    preparedStatement.setString(3, user.getGender());
                    preparedStatement.setString(4, user.getPhoneNumber());
                    preparedStatement.setInt(5, user.getShift());
                    preparedStatement.setInt(6, userId); // Sử dụng userId thay vì user.getId()

                    int result = preparedStatement.executeUpdate();
                    if(result > 0) JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", 2);
                }
            }
        }
    }


    public static boolean changeRole(int id, int roleId) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String checkPermission = "SELECT r.roleName FROM Users u JOIN [Role] r ON r.id = u.roleId JOIN LastLogin ll ON ll.UserId = u.id WHERE ll.loginTime = (SELECT MAX(loginTime) FROM LastLogin) GROUP BY r.roleName";
        PreparedStatement checkPermissionStatement = connection.prepareStatement(checkPermission);
        ResultSet resultSet = checkPermissionStatement.executeQuery();
        if (!resultSet.next() || !resultSet.getString("roleName").equals(roleEnum.ADMIN.toString())) {
            connection.close();
            return false;
        }
        String query = "UPDATE Users SET roleId = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, roleId);
        preparedStatement.setInt(2, id);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

//    public static void main(String[] args) {
//        UserDAO usersDAO = new UserDAO();
//        try {
//            System.out.println(usersDAO.login("admin", "Abc@12345"));
//        } catch (SQLException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

}
