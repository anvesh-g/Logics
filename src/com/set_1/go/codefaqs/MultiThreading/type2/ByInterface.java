package com.set_1.go.codefaqs.MultiThreading.type2;

public class ByInterface implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println("Thread "+i+" "+Thread.currentThread().getId());
        }
    }
}
