package com.designPatterns.structuralPatterns.facade.problem;

public class Driver {
    public static void main(String[] args) {
        NotificationServer server=new NotificationServer();
        Connection con=server.connect();
        Authenticate auth=server.authenticate("anvesh","1234");
        String response=server.sendMessage(auth,"Hello");
        System.out.println("response "+response);
        con.disconnect();

        // whenever we want to send these steps are mandate
        // so there is problem o doing repetitive task
    }
}
