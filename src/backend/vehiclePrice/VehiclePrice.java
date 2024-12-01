package src.backend.vehiclePrice;

import src.backend.enums.vehicleTypeEnum;

public class VehiclePrice {

    private int id;
    private vehicleTypeEnum vehicleType;
    private double monthlyPrice;
    private double morningPrice;
    private double afternoonPrice;
    private double nightPrice;

    public VehiclePrice(vehicleTypeEnum vehicleType, double monthlyPrice, double morningPrice, double afternoonPrice,
            double nightPrice) {
        this.vehicleType = vehicleType;
        this.monthlyPrice = monthlyPrice;
        this.morningPrice = morningPrice;
        this.afternoonPrice = afternoonPrice;
        this.nightPrice = nightPrice;
    }

    public VehiclePrice(int id, vehicleTypeEnum vehicleType, double monthlyPrice, double morningPrice,
            double afternoonPrice, double nightPrice) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.monthlyPrice = monthlyPrice;
        this.morningPrice = morningPrice;
        this.afternoonPrice = afternoonPrice;
        this.nightPrice = nightPrice;
    }

    public int getId() {
        return id;
    }

    public vehicleTypeEnum getVehicleType() {
        return vehicleType;
    }

    public double getMonthlyPrice() {
        return monthlyPrice;
    }

    public double getMorningPrice() {
        return morningPrice;
    }

    public double getAfternoonPrice() {
        return afternoonPrice;
    }

    public double getNightPrice() {
        return nightPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVehicleType(vehicleTypeEnum vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setMonthlyPrice(double monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
    }

    public void setMorningPrice(double morningPrice) {
        this.morningPrice = morningPrice;
    }

    public void setAfternoonPrice(double afternoonPrice) {
        this.afternoonPrice = afternoonPrice;
    }

    public void setNightPrice(double nightPrice) {
        this.nightPrice = nightPrice;
    }

}
