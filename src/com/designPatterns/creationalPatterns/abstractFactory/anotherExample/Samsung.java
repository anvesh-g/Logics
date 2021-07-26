package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;


public class Samsung implements IMobile {
    @Override
    public void cost() {
        System.out.println("Samsung cost 25000");
    }

    @Override
    public void pictureQuality() {
        System.out.println("Samsung cost 1080P");
    }

    @Override
    public void batterCapacity() {
        System.out.println("Samsung cost 3200 mah");
    }
}
