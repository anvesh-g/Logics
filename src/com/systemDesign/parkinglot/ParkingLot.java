package com.systemDesign.parkinglot;


import com.systemDesign.parkinglot.vehicle.Vehicle;

public class ParkingLot {
    private String lotNumber;


    public ParkingLot(String lotNumber) {
        this.lotNumber = lotNumber;
    }


    public Slot parkVehicle(Vehicle vehicle){
        Slot slot =new Slot(lotNumber,vehicle.getSize());
        slot.setVehicle(vehicle);
        return slot;
    }

    public Slot unParkVehicle(Slot slot) throws Exception{
        if(slot.getVehicle()==null){
            throw new Exception("vehicle not found please check the slot you parked ");
        }
        return slot;
    }
}
