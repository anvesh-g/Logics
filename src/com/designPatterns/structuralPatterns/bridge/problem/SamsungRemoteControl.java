package com.designPatterns.structuralPatterns.bridge.problem;

public class SamsungRemoteControl extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("samsung turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("samsung turn off");
    }
}
