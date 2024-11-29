package src.backend.vehiclePrice;

import src.backend.databaseConnector.databaseConnector;
import src.backend.enums.vehicleTypeEnum;
import java.sql.*;

import java.util.*;

public class VehiclePriceDAO {
    public List<VehiclePrice> getAllVehiclePrice() throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM VehiclePrice";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<VehiclePrice> vehiclePrices = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            vehicleTypeEnum vehicleType = vehicleTypeEnum.valueOf(resultSet.getString("vehicleType"));
            double monthlyPrice = resultSet.getDouble("monthlyPrice");
            double morningPrice = resultSet.getDouble("morningPrice");
            double afternoonPrice = resultSet.getDouble("afternoonPrice");
            double nightPrice = resultSet.getDouble("nightPrice");
            VehiclePrice vehiclePrice = new VehiclePrice(id, vehicleType, monthlyPrice, morningPrice, afternoonPrice,
                    nightPrice);
            vehiclePrices.add(vehiclePrice);
        }
        connection.close();
        return vehiclePrices;
    }

    public boolean updateVehiclePrice(vehicleTypeEnum vehicleType, double monthlyPrice, double morningPrice,
            double afternoonPrice, double nightPrice) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "UPDATE VehiclePrice SET monthlyPrice = ?, morningPrice = ?, afternoonPrice = ?, nightPrice = ? WHERE vehicleType = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setDouble(1, monthlyPrice);
        preparedStatement.setDouble(2, morningPrice);
        preparedStatement.setDouble(3, afternoonPrice);
        preparedStatement.setDouble(4, nightPrice);
        preparedStatement.setString(5, vehicleType.toString());
        int result = preparedStatement.executeUpdate();
        connection.close();
        return result > 0;
    }
}
