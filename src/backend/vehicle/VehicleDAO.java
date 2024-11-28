package src.backend.vehicle;

import java.sql.*;

import src.backend.databaseConnector;
import src.backend.enums.vehicleTypeEnum;

public class VehicleDAO {
    public boolean addVehicle(Vehicle vehicle) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "INSERT INTO Vehicle (type, plateNumber, entryTime) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, vehicle.getType().toString());
        preparedStatement.setString(2, vehicle.getPlateNumber());
        preparedStatement.setDate(3, vehicle.getEntryTime());
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

    public boolean deleteVehicle(int id) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "DELETE FROM Vehicle WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, id);
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }

}