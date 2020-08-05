package com.designPatterns.behavioralPatterns.chainOfResponsibility;

public class Authenticator extends Handler{
    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        boolean isValid= (httpRequest.getName().equals("admin") &&
                   httpRequest.getPassword().equalsIgnoreCase("12345"));
        System.out.println("Authentication");
        return !isValid;
    }


}
