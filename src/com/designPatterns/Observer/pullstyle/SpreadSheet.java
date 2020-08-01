package com.designPatterns.Observer.pullstyle;

public class SpreadSheet implements Observer {
    private DataSource ds;

    public SpreadSheet(DataSource ds) {
        this.ds = ds;
    }

    @Override
    public void update() {
        System.out.println("Spread sheet got updated "+ds.getValue());
    }
}
