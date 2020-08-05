package com.designPatterns.structural.composite.excercise;


public class SubTeam implements Composite {

    private String truckName;
    private String humanResources;


    public SubTeam(String truckName, String humanResources) {
        this.truckName = truckName;
        this.humanResources = humanResources;
    }


    @Override
    public void deployTruck() {
        System.out.println("truck "+truckName);
    }

    @Override
    public void deployHumanResources() {
        System.out.println("human resource "+humanResources);
    }
}
