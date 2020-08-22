package com.designPatterns.structuralPatterns.facade.solution;

public class Driver {
    public static void main(String[] args) {
        NotificationService service=new NotificationService();
        service.sendMessage("Hello");
    }
}
