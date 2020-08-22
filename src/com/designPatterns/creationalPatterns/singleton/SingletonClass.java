package com.designPatterns.creationalPatterns.singleton;

public class SingletonClass implements Cloneable{
    private static SingletonClass singletonClass=null;

    private SingletonClass() {
    }

    public static synchronized SingletonClass getSingletonClass(){
        if(singletonClass==null){
            System.out.println("Creating first time");
            singletonClass=new SingletonClass();
        }
        return singletonClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("no");
    }
}
