package com.designPatterns.behavioralPatterns.state.anotherExample;

public class Silent implements MobileState {
    @Override
    public void getState() {
        System.out.println("Silent");
    }
}
