package com.designPatterns.behavioralPatterns.Observer.communicatonstyle;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spread sheet got updated");
    }
}
