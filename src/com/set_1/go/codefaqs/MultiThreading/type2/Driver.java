package com.set_1.go.codefaqs.MultiThreading.type2;

public class Driver  {

    public static void main(String[] args) {
        Thread t=new Thread(new ByInterface());
        t.start();
    }
}
