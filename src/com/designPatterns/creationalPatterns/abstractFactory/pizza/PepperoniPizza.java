package com.designPatterns.creationalPatterns.abstractFactory.pizza;


import com.designPatterns.creationalPatterns.abstractFactory.toppingFactory.BaseToppingFactory;

public class PepperoniPizza extends Pizza {

    BaseToppingFactory toppingFactory;

    public PepperoniPizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding pepperoni");
        toppingFactory.createCheese();
        toppingFactory.createSauce();

    }
}
