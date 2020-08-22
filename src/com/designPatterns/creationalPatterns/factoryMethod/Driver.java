package com.designPatterns.creationalPatterns.factoryMethod;

public class Driver {
    public static void main(String[] args) {
        BasePizzaFactory factory=new PizzaFactory();
        Pizza pizza=factory.createPizza("veggie");
    }
}
