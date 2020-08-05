package com.designPatterns.behavioralPatterns.Observer.pushstyle;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spread sheet got updated "+value);
    }
}
