package com.designPatterns.creationalPatterns.abstractFactory.pizza;

public abstract class Pizza {

    public abstract void addIngredients();

    public void bakePizza(){
        System.out.println("Pizza baked");
    }

}
