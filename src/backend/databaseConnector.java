package src.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class databaseConnector {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=BTL_OOP;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "Nguyenngocnhat2004";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        // Load the SQL Server JDBC driver (this step is optional in newer JDBC
        // versions)
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Establish connection using the URL, username, and password
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
