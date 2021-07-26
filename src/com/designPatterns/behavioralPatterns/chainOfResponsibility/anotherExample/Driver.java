package com.designPatterns.behavioralPatterns.chainOfResponsibility.anotherExample;

public class Driver {
    public static void main(String[] args) {
        Chain c1=new NegativeNumberProcessor();
        Chain c2=new PositiveNumberProcessor();
        Chain c3=new ZeroNumberProcessor();

        c1.setNext(c2);
        c2.setNext(c3);
        c1.process(new Number(0));
        c1.process(new Number(-1));
        c1.process(new Number(1));
    }
}
