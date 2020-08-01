package com.designPatterns.Observer.pullstyle;

public class Driver {
    public static void main(String[] args) {
        DataSource ds=new DataSource();
        SpreadSheet s1=new SpreadSheet(ds);
        SpreadSheet s2=new SpreadSheet(ds);

        Chart c1=new Chart(ds);

        ds.addObserver(s1);
        ds.addObserver(s2);
        ds.addObserver(c1);

        ds.setValue(102);
    }
}
