package com.designPatterns.creationalPatterns.factoryMethod;

public class PizzaFactory implements BasePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        switch (type){
            case "cheese":
                pizza=new CheesePizza();
                break;
            case "pepperoni":
                pizza=new PepperoniPizza();
                break;
            case "veggie":
                pizza=new VeggiePizza();
                break;
            default:
                pizza=new CheesePizza();
                break;
        }
        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }
}
