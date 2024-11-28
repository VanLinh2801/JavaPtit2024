package src.backend.vehicle;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import src.backend.enums.vehicleTypeEnum;

public class Vehicle {

    private int id;
    private vehicleTypeEnum type;
    private String plateNumber;
    private Date entryTime;

    public Vehicle(String plateNumber, vehicleTypeEnum type, Date entryTime) {
        this.plateNumber = plateNumber;
        this.type = type;
        this.entryTime = entryTime;
    }

    public Vehicle(int id, String plateNumber, vehicleTypeEnum type, Date entryTime) {
        this.id = id;
        this.plateNumber = plateNumber;
        this.type = type;
        this.entryTime = entryTime;
    }

    public int getId() {
        return id;
    }

    public vehicleTypeEnum getType() {
        return type;
    }

    public void setType(vehicleTypeEnum type) {
        this.type = type;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

}
