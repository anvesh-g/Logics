package com.designPatterns.creationalPatterns.abstractFactory.pizza;


import com.designPatterns.creationalPatterns.abstractFactory.toppingFactory.BaseToppingFactory;

public class CheesePizza extends Pizza {
    BaseToppingFactory toppingFactory;
    public CheesePizza(BaseToppingFactory toppingFactory) {
        this.toppingFactory=toppingFactory;
    }

    @Override
    public void addIngredients() {
        System.out.println("Adding cheese");
        toppingFactory.createCheese();
        toppingFactory.createSauce();
    }
}
