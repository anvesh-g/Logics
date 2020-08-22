package com.designPatterns.creationalPatterns.abstractFactory.pizzaFactory;

import com.designPatterns.creationalPatterns.abstractFactory.pizza.Pizza;

public abstract class BasePizzaFactory {
    public abstract Pizza createPizza(String type);
}
