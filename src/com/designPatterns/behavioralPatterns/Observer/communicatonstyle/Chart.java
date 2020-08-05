package com.designPatterns.behavioralPatterns.Observer.communicatonstyle;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
