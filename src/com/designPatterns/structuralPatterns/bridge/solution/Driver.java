package com.designPatterns.structuralPatterns.bridge.solution;

public class Driver {
    public static void main(String[] args) {
        AdvanceRemoteControl rc=new AdvanceRemoteControl(new SonyTv());
        rc.turnOn();
        rc.setChannel(10);
        rc.turnOff();

        AdvanceRemoteControl src=new AdvanceRemoteControl(new SamsungTv());
        src.turnOn();
        src.setChannel(10);
        src.turnOff();



    }
}
