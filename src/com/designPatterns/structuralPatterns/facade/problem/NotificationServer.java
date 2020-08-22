package com.designPatterns.structuralPatterns.facade.problem;

public class NotificationServer {
    public Connection connect(){
        return new Connection().connect();
    }

    public Authenticate authenticate(String username,String password){
        Authenticate auth=new Authenticate();
        return auth.authenticate(username,password);
    }

    public String sendMessage(Authenticate authenticate,String message){
        SendMessage message1=new SendMessage();
        return message1.sendMessage(authenticate,message);
    }

}
