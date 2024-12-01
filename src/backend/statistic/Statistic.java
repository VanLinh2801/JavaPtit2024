package src.backend.statistic;

import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;

public class Statistic {
    private ticketTypeEnum ticketType;
    private vehicleTypeEnum vehicleType;
    private int beginningBalance;
    private int endingBalance;
    private int entryDuringPeriod;
    private int exitDuringPeriod;
    private double totalPrice;

    public ticketTypeEnum getTicketType() {
        return ticketType;
    }

    public vehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public int getEndingBalance() {
        return endingBalance;
    }

    public int getEntryDuringPeriod() {
        return entryDuringPeriod;
    }

    public int getExitDuringPeriod() {
        return exitDuringPeriod;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTicketType(ticketTypeEnum ticketType) {
        this.ticketType = ticketType;
    }

    public void setVehicleType(vehicleTypeEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setBeginningBalance(int beginningBalance) {
        this.beginningBalance = beginningBalance;
    }

    public void setEndingBalance(int endingBalance) {
        this.endingBalance = endingBalance;
    }

    public void setEntryDuringPeriod(int entryDuringPeriod) {
        this.entryDuringPeriod = entryDuringPeriod;
    }

    public void setExitDuringPeriod(int exitDuringPeriod) {
        this.exitDuringPeriod = exitDuringPeriod;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
