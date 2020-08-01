package com.designPatterns.chainOfResponsibility;

import com.set_1.go.A;

public class Driver {
    public static void main(String[] args) {
        Compressor c=new Compressor(null);
        Logger l=new Logger(c);
        Authenticator a= new Authenticator(l);

        WebServer ws=new WebServer(a);
        a.handle(new HttpRequest("admin","12345"));


    }
}
