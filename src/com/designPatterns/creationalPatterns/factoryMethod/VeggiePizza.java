package com.designPatterns.creationalPatterns.factoryMethod;

public class VeggiePizza extends Pizza{
    @Override
    public void addIngredients() {
        System.out.println("Adding Veggies");
    }
}
