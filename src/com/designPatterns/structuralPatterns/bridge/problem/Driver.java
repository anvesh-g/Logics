package com.designPatterns.structuralPatterns.bridge.problem;

public class Driver {
    public static void main(String[] args) {

        // RemoteControl
        //  SonyRemoteControl
        //  SamsungRemoteControl
        //  LGRemoteControl
        //      AdvancedRemoteControl
        //          AdvancedSonyRemoteControl
        //          AdvancedSamsungRemoteControl
        //          AdvancedLGRemoteControl



        // Heirarchy keeps on increasing as the number of tvs(implementation increases)
        SonyRemoteControl src=new SonyRemoteControl();
        src.turnOn();
        SonyAdvancedRemoteControl sarc=new SonyAdvancedRemoteControl();
        sarc.setChannel(10);
        src.turnOff();

    }
}
