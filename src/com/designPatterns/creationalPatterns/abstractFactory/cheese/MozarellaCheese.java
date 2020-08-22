package com.designPatterns.creationalPatterns.abstractFactory.cheese;

public class MozarellaCheese implements Cheese {

    public MozarellaCheese() {
        prepareCheese();
    }

    @Override
    public void prepareCheese() {
        System.out.println("Preparing mozarella Cheese");
    }
}
