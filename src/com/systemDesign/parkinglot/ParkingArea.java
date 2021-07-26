package com.systemDesign.parkinglot;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ParkingArea {

    private final int SIZE_OF_SMALL_SPOTS=10;
    private final int SIZE_OF_MEDIUM_SPOTS=10;
    private final int SIZE_OF_LARGE_SPOTS=10;

    private Stack<Slot> smallSlots=new Stack<>();
    private Stack<Slot> mediumSlots=new Stack<>();
    private Stack<Slot> largeSlots=new Stack<>();

    Map<Size,Stack<Slot>> parkingAvailability=new HashMap<>();

    public ParkingArea(){

        for(int i=SIZE_OF_SMALL_SPOTS-1; i>=0; i--){
            smallSlots.push(new Slot("SMALL"+i,Size.SMALL));
        }
        for(int i=SIZE_OF_MEDIUM_SPOTS-1; i>=0; i--){

            mediumSlots.push(new Slot("MEDIUM"+i,Size.MEDIUM));
        }
        for(int i=SIZE_OF_LARGE_SPOTS-1; i>=0; i--){
            largeSlots.push(new Slot("LARGE"+i,Size.LARGE));
        }

        parkingAvailability.put(Size.SMALL,smallSlots);
        parkingAvailability.put(Size.MEDIUM,mediumSlots);
        parkingAvailability.put(Size.LARGE,largeSlots);


    }

    public Stack<Slot> getSmallSlots() {
        return smallSlots;
    }

    public Stack<Slot> getMediumSlots() {
        return mediumSlots;
    }

    public Stack<Slot> getLargeSlots() {
        return largeSlots;
    }

    public Map<Size, Stack<Slot>> getParkingAvailability() {
        return parkingAvailability;
    }

    public void setParkingAvailability(Map<Size, Stack<Slot>> parkingAvailability) {
        this.parkingAvailability = parkingAvailability;
    }

    public void checkAvailableSpots(){
        System.out.println("Small Slots "+smallSlots.size());
        System.out.println("Medium Slots "+mediumSlots.size());
        System.out.println("Large Slots "+largeSlots.size());
    }
}
