package com.designPatterns.structuralPatterns.bridge.problem;

public class SonyAdvancedRemoteControl extends AdvancedRemoteControl {
    @Override
    public void setChannel(int n) {
        System.out.println("set channel");
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
