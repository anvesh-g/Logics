package com.systemDesign.parkinglot.vehicle;

import com.systemDesign.parkinglot.Size;

public class Bus implements Vehicle {

    @Override
    public String getLicense() {
        return null;
    }

    @Override
    public Size getSize() {
        return null;
    }

    @Override
    public boolean getStatus() {
        return false;
    }
}
