package src.backend.ticket;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

import java.util.Calendar;

public class Ticket {
    private int id;
    private ticketTypeEnum ticketType;
    private Date entryTime;
    private Date exitTime;
    private double price;
    private String plateNumber;
    private vehicleTypeEnum vehicleType;
    private int UserId;

    public Ticket(Date entryTime, String plateNumber,
            vehicleTypeEnum vehicleType) {
        this.entryTime = entryTime;
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
    }

    public Ticket(int id, ticketTypeEnum ticketType, Date entryTime, Date exitTime, double price, String plateNumber,
            vehicleTypeEnum vehicleType, int UserId) {
        this.id = id;
        this.ticketType = ticketType;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.price = price;
        this.plateNumber = plateNumber;
        this.vehicleType = vehicleType;
        this.UserId = UserId;
    }

    public int getId() {
        return id;
    }

    public ticketTypeEnum getTicketType() {
        return ticketType;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public double getPrice() {
        return price;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public vehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    public int getUserId() {
        return UserId;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTicketType(ticketTypeEnum ticketType) {
        this.ticketType = ticketType;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}