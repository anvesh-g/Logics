package com.designPatterns.structuralPatterns.facade.solution;

public class SendMessage {
    public String sendMessage(Authenticate auth, String message){
        if(auth.isValidUser()){
            return "Message sent";
        }else{
            return "Authentication failed";
        }
    }
}
