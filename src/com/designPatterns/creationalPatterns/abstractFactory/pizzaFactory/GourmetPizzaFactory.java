package com.designPatterns.creationalPatterns.abstractFactory.pizzaFactory;

import com.designPatterns.creationalPatterns.abstractFactory.pizza.CheesePizza;
import com.designPatterns.creationalPatterns.abstractFactory.pizza.PepperoniPizza;
import com.designPatterns.creationalPatterns.abstractFactory.pizza.Pizza;
import com.designPatterns.creationalPatterns.abstractFactory.toppingFactory.BaseToppingFactory;
import com.designPatterns.creationalPatterns.abstractFactory.toppingFactory.GourmetToppingFactory;

public class GourmetPizzaFactory extends BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        BaseToppingFactory toppingFactory=new GourmetToppingFactory();
        switch (type){
            case "cheese":
                pizza=new CheesePizza(toppingFactory);
            case "pepperoni":
                pizza = new PepperoniPizza(toppingFactory);
                break;
            default: throw new IllegalArgumentException("No such pizza.");
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
