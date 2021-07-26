package com.systemDesign.parkinglot;

import com.systemDesign.parkinglot.vehicle.Vehicle;

public class Slot {

    private String lotNumber;
    private Size size;
    private Vehicle vehicle;

    public Slot(String lotNumber, Size size) {
        this.lotNumber = lotNumber;
        this.size = size;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
