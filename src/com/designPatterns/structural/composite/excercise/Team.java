package com.designPatterns.structural.composite.excercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Composite {
    public List<Composite> teams=new ArrayList<>();

    public void add(Composite composite){
        teams.add(composite);
    }

    @Override
    public void deployTruck() {
        for (Composite team:teams) {
            team.deployTruck();
        }
    }

    @Override
    public void deployHumanResources() {
        for (Composite team:teams) {
            team.deployHumanResources();
        }
    }

}
