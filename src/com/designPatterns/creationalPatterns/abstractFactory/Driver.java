package com.designPatterns.creationalPatterns.abstractFactory;

import com.designPatterns.creationalPatterns.abstractFactory.pizza.Pizza;
import com.designPatterns.creationalPatterns.abstractFactory.pizzaFactory.BasePizzaFactory;
import com.designPatterns.creationalPatterns.abstractFactory.pizzaFactory.GourmetPizzaFactory;

public class Driver {
    public static void main(String[] args) {
        BasePizzaFactory factory=new GourmetPizzaFactory();
        Pizza pizza=factory.createPizza("cheese");
    }
}
