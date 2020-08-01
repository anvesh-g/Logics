package com.designPatterns.Observer.communicatonstyle;

public class Driver {
    public static void main(String[] args) {
        DataSource ds=new DataSource();
        SpreadSheet s1=new SpreadSheet();
        SpreadSheet s2=new SpreadSheet();

        Chart c1=new Chart();

        ds.addObserver(s1);
        ds.addObserver(s2);
        ds.addObserver(c1);

        ds.setValue(100);
    }
}
