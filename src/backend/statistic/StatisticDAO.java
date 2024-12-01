package src.backend.statistic;

import java.util.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

public class StatisticDAO {
    public List<Statistic> calculateStatistic(Date startTime, Date endTime, ticketTypeEnum ticketType,
            vehicleTypeEnum vehicleType) throws ClassNotFoundException, SQLException {
        // Initialize the connection
        Connection connection = databaseConnector.getConnection();
        List<Statistic> statistics = new ArrayList<>();

        // Build the SQL query with filters
        String query = "SELECT VP.vehicleType AS VehicleType, T.ticketType AS TicketType, COUNT(CASE WHEN T.entryTime < ? AND (T.exitTime IS NULL OR T.exitTime >= ?) THEN 1 END) AS BeginningBalance, COUNT(CASE WHEN T.entryTime BETWEEN ? AND ? THEN 1 END) AS EntriesDuringPeriod, COUNT(CASE WHEN T.exitTime BETWEEN ? AND ? THEN 1 END) AS ExitsDuringPeriod, COUNT(CASE WHEN T.entryTime <= ? AND (T.exitTime IS NULL OR T.exitTime > ?) THEN 1 END) AS EndingBalance, SUM(CASE WHEN T.exitTime BETWEEN ? AND ? THEN T.price ELSE 0 END) AS TotalRevenue FROM BTL_OOP.dbo.Ticket T LEFT JOIN BTL_OOP.dbo.VehiclePrice VP ON T.vehicleType = VP.vehicleType WHERE (? IS NULL OR T.ticketType = ?) AND (? IS NULL OR T.vehicleType = ?) GROUP BY VP.vehicleType, T.ticketType ORDER BY VP.vehicleType, T.ticketType;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);

        // Set parameters for the query
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

        // Execute the query
        ResultSet resultSet = preparedStatement.executeQuery();

        // Process the results
        while (resultSet.next()) {
            Statistic statistic = new Statistic();
            vehicleTypeEnum vehicleTypeResult = vehicleTypeEnum.valueOf(resultSet.getString("VehicleType"));
            ticketTypeEnum ticketTypeResult = ticketTypeEnum.valueOf(resultSet.getString("TicketType"));
            statistic.setVehicleType(vehicleTypeResult);
            statistic.setTicketType(ticketTypeResult);
            statistic.setBeginningBalance(resultSet.getInt("BeginningBalance"));
            statistic.setEntryDuringPeriod(resultSet.getInt("EntriesDuringPeriod"));
            statistic.setExitDuringPeriod(resultSet.getInt("ExitsDuringPeriod"));
            statistic.setEndingBalance(resultSet.getInt("EndingBalance"));
            statistic.setTotalPrice(resultSet.getDouble("TotalRevenue"));

            statistics.add(statistic);
        }
        resultSet.close();
        preparedStatement.close();
        connection.close();

        return statistics;
    }

    public static void main(String[] args) {
        StatisticDAO statisticDAO = new StatisticDAO();
        try {
            List<Statistic> statistics = statisticDAO.calculateStatistic(Date.valueOf("2024-11-29"),
                    Date.valueOf("2024-11-30"), null, null);
            for (Statistic statistic : statistics) {
                System.out.println(statistic.getVehicleType() + " " + statistic.getTicketType() + " "
                        + statistic.getBeginningBalance() + " " + statistic.getEntryDuringPeriod() + " "
                        + statistic.getExitDuringPeriod() + " " + statistic.getEndingBalance() + " "
                        + statistic.getTotalPrice());
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
