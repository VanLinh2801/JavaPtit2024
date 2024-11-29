package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    public static Connection getConnection() {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=OnlineShop;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "123456";

        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (SQLException e) {
            System.out.println("Fail: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        getConnection();
    }
}
