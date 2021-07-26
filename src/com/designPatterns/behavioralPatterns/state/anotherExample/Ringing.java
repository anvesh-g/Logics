package com.designPatterns.behavioralPatterns.state.anotherExample;

public class Ringing implements MobileState {

    @Override
    public void getState() {
        System.out.println("Ringing");
    }
}
