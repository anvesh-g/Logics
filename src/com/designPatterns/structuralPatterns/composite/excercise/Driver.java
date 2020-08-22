package com.designPatterns.structuralPatterns.composite.excercise;

public class Driver {
    public static void main(String[] args) {
        Team t1=new Team();
        t1.add(new SubTeam("eicher","rapid action force"));
        t1.add(new SubTeam("tipper","Fire mans"));

        Team t2=new Team();
        t2.add(new SubTeam("min ace","something "));
        t2.add(new SubTeam("leyland","backup"));

        Team t=new Team();
        t.add(t1);
        t.add(t2);

        t.deployTruck();
        t.deployHumanResources();


    }
}
