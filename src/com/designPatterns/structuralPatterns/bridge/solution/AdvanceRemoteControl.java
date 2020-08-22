package com.designPatterns.structuralPatterns.bridge.solution;

public class AdvanceRemoteControl extends RemoteControl {

    public AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int n){
        device.setChannel(n);
    }
}
