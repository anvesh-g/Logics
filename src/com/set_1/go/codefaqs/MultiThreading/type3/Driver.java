package com.set_1.go.codefaqs.MultiThreading.type3;

import java.util.concurrent.*;

public class Driver {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> call=new ByExecutor();


        //Type-1
        FutureTask<Integer> f=new FutureTask<>(call);
        Thread t=new Thread(f);
        t.start();
        System.out.println(f.get());


        //Type-2
        final ExecutorService executor1 = Executors.newFixedThreadPool(1);
        FutureTask<Integer> f2= (FutureTask<Integer>) executor1.submit(call);
        System.out.println(f2.get());

    }
}
