package com.designPatterns.creationalPatterns.singleton;

public class Driver {
    public static void main(String[] args) {
        SingletonClass singletonClass=SingletonClass.getSingletonClass();
        SingletonClass singletonClass2=SingletonClass.getSingletonClass();

        if(singletonClass == singletonClass2){
            System.out.println("Equal");
        }
    }
}
