package com.designPatterns.structuralPatterns.facade.problem;

public class Connection {

    public Connection connect() {
        System.out.println("Connection Established");
        return new Connection();
    }

    public void disconnect(){
        System.out.println("Disconnected");
    }
}
