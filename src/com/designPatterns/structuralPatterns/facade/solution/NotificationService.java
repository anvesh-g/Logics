package com.designPatterns.structuralPatterns.facade.solution;

public class NotificationService {
    public void sendMessage(String message){
        NotificationServer server=new NotificationServer();
        Connection con=server.connect();
        Authenticate auth=server.authenticate("anvesh","1234");
        String response=server.sendMessage(auth,message);
        System.out.println("response "+response);
        con.disconnect();
    }
}
