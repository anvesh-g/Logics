package com.systemDesign.parkinglot.vehicle;

import com.systemDesign.parkinglot.Size;

public class Bike implements Vehicle {

    private String license;


    public Bike(String license) {
        this.license = license;

    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Size getSize() {
        return Size.SMALL;
    }



    @Override
    public boolean getStatus() {
        return false;
    }
}
