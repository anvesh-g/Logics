package com.designPatterns.creationalPatterns.factoryMethod;

public class PepperoniPizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Adding pepperoni");
    }
}
