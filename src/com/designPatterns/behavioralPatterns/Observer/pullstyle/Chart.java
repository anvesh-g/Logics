package com.designPatterns.behavioralPatterns.Observer.pullstyle;



public class Chart implements Observer {
    private DataSource ds;

    public Chart(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public void update() {
        System.out.println("Chart got updated "+ds.getValue());
    }
}
