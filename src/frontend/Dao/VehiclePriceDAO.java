package Dao;

import connection.databaseConnector;
import enums.vehicleTypeEnum;
import Dao.vehiclePrice;
import java.sql.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VehiclePriceDAO {

    Connection con = databaseConnector.getConnection();
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    
    public List<vehiclePrice> getAllVehiclePrice() throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM VehiclePrice";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<vehiclePrice> vehiclePrices = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            vehicleTypeEnum vehicleType = vehicleTypeEnum.valueOf(resultSet.getString("vehicleType"));
            double monthlyPrice = resultSet.getDouble("monthlyPrice");
            double morningPrice = resultSet.getDouble("morningPrice");
            double afternoonPrice = resultSet.getDouble("afternoonPrice");
            double nightPrice = resultSet.getDouble("nightPrice");
            vehiclePrice vehiclePrice = new vehiclePrice(id, vehicleType, monthlyPrice, morningPrice, afternoonPrice,
                    nightPrice);
            vehiclePrices.add(vehiclePrice);
        }
        connection.close();
        return vehiclePrices;
    }
    
     public vehiclePrice getVehiclePrice(vehicleTypeEnum v) throws SQLException, ClassNotFoundException {
        Connection connection = databaseConnector.getConnection();
        String query = "SELECT * FROM VehiclePrice WHERE vehicleType = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, v.toString());
        ResultSet result = preparedStatement.executeQuery();
        if(result.next()){
            vehicleTypeEnum vehicleType = vehicleTypeEnum.valueOf(result.getString("vehicleType"));
            double monthlyPrice = result.getDouble("monthlyPrice");
            double morningPrice = result.getDouble("morningPrice");
            double afternoonPrice = result.getDouble("afternoonPrice");
            double nightPrice = result.getDouble("nightPrice");
            return new vehiclePrice(vehicleType, monthlyPrice, morningPrice, afternoonPrice, nightPrice);
        }
        connection.close();
        return null;
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
    
    public void getPrice(JTable table){
        String sql = "select vehicleType, morningPrice, afternoonPrice, nightPrice, monthlyPrice from VehiclePrice";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while(rs.next()){
                row = new Object[5];
                row[0] = rs.getString(1);
                row[1] = rs.getDouble(2);
                row[2] = rs.getDouble(3);
                row[3] = rs.getDouble(4);
                row[4] = rs.getDouble(5);
                model.addRow(row);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VehiclePriceDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
