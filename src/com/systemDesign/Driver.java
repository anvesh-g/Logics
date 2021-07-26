package com.systemDesign;

import com.systemDesign.parkinglot.*;
import com.systemDesign.parkinglot.vehicle.Bike;
import com.systemDesign.parkinglot.vehicle.Vehicle;

public class Driver {
    public static void main(String[] args) throws Exception{
        ParkingArea pa=new ParkingArea();

        pa.checkAvailableSpots();

        Vehicle bike=new Bike("TG123");

        //get slot from parking area

        Slot s=getParkingSlot(pa,bike);

        ParkingLot pl=new ParkingLot(s.getLotNumber());
        Slot slot = pl.parkVehicle(bike);
        if(slot.getSize()==Size.SMALL){
            pa.getSmallSlots().pop();
        }
        if(slot.getSize()==Size.MEDIUM){
            pa.getMediumSlots().pop();
        }
        if(slot.getSize()==Size.LARGE){
            pa.getLargeSlots().pop();
        }

        System.out.println("vehicle parked at slot "+ slot.getLotNumber());

        pa.checkAvailableSpots();

        Slot unspot=pl.unParkVehicle(slot);
        System.out.println("Unparked vehicle with license "+unspot.getVehicle().getLicense()+ "at slot "+unspot.getLotNumber());
        unspot.setVehicle(null);
        if(slot.getSize()==Size.SMALL){
            pa.getSmallSlots().push(new Slot(unspot.getLotNumber(),unspot.getSize()));
        }
        if(slot.getSize()==Size.MEDIUM){
            pa.getMediumSlots().push(new Slot(unspot.getLotNumber(),unspot.getSize()));
        }
        if(slot.getSize()==Size.LARGE) {
            pa.getLargeSlots().push(new Slot(unspot.getLotNumber(), unspot.getSize()));
        }


        pa.checkAvailableSpots();

    }

    public static Slot getParkingSlot(ParkingArea pa, Vehicle bike){
        // check which slot to return from parking Area
        if(pa.getParkingAvailability().get(bike.getSize()).size()!=0){
            //park in available area
        }else{

        }




        return new Slot("SMALL1",bike.getSize());
    }
}
