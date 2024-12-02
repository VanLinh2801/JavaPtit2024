package src.backend.statistic;

import java.util.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

public class StatisticDAO {
    public void calculateStatistic(JTable table, Date startTime, Date endTime, ticketTypeEnum ticketType,
            vehicleTypeEnum vehicleType) throws ClassNotFoundException, SQLException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT VP.vehicleType AS VehicleType, T.ticketType AS TicketType, COUNT(CASE WHEN T.entryTime < ? AND (T.exitTime IS NULL OR T.exitTime >= ?) THEN 1 END) AS BeginningBalance, COUNT(CASE WHEN T.entryTime BETWEEN ? AND ? THEN 1 END) AS EntriesDuringPeriod, COUNT(CASE WHEN T.exitTime BETWEEN ? AND ? THEN 1 END) AS ExitsDuringPeriod, COUNT(CASE WHEN T.entryTime <= ? AND (T.exitTime IS NULL OR T.exitTime > ?) THEN 1 END) AS EndingBalance, SUM(CASE WHEN T.exitTime BETWEEN ? AND ? THEN T.price ELSE 0 END) AS TotalRevenue FROM BTL_OOP.dbo.Ticket T LEFT JOIN BTL_OOP.dbo.VehiclePrice VP ON T.vehicleType = VP.vehicleType WHERE (? IS NULL OR T.ticketType = ?) AND (? IS NULL OR T.vehicleType = ?) GROUP BY VP.vehicleType, T.ticketType ORDER BY VP.vehicleType, T.ticketType;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setDate(1, startTime); // For BeginningBalance (startTime)
        preparedStatement.setDate(2, startTime); // For BeginningBalance (startTime)
        preparedStatement.setDate(3, startTime); // For EntriesDuringPeriod
        preparedStatement.setDate(4, endTime); // For EntriesDuringPeriod
        preparedStatement.setDate(5, startTime); // For ExitsDuringPeriod
        preparedStatement.setDate(6, endTime); // For ExitsDuringPeriod
        preparedStatement.setDate(7, endTime); // For EndingBalance (endTime)
        preparedStatement.setDate(8, endTime); // For EndingBalance (endTime)
        preparedStatement.setDate(9, startTime); // For TotalRevenue
        preparedStatement.setDate(10, endTime); // For TotalRevenue
        preparedStatement.setString(11, ticketType == null ? null : ticketType.name()); // TicketType filter
        preparedStatement.setString(12, ticketType == null ? null : ticketType.name()); // TicketType filter
        preparedStatement.setString(13, vehicleType == null ? null : vehicleType.name()); // VehicleType filter
        preparedStatement.setString(14, vehicleType == null ? null : vehicleType.name()); // VehicleType filter
        ResultSet rs = preparedStatement.executeQuery();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object row[];
        while (rs.next()) {
            row = new Object[7];
            row[0] = rs.getString(2);
            row[1] = rs.getString(1);
            row[2] = rs.getInt(3);
            row[3] = rs.getInt(4);
            row[4] = rs.getInt(5);
            row[5] = rs.getInt(6);
            row[6] = rs.getDouble(7);
            model.addRow(row);
        }
        rs.close();
        preparedStatement.close();
        connection.close();
    }
}