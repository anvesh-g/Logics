package com.designPatterns.creationalPatterns.factoryMethod;

public class CheesePizza extends Pizza {
    @Override
    public void addIngredients() {
        System.out.println("Adding cheese");
    }
}
