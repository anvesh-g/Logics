package com.designPatterns.behavioralPatterns.chainOfResponsibility;

public class Driver {
    public static void main(String[] args) {
        Compressor c=new Compressor(null);
        Logger l=new Logger(c);
        Authenticator a= new Authenticator(l);

        WebServer ws=new WebServer(a);
        a.handle(new HttpRequest("admin","12345"));


    }
}
