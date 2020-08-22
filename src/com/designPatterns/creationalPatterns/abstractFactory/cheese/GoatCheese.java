package com.designPatterns.creationalPatterns.abstractFactory.cheese;

public class GoatCheese implements Cheese {
    public GoatCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("preparing goat cheeese");
    }
}
