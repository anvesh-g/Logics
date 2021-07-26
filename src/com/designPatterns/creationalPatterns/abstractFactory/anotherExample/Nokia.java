package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;

public class Nokia implements IMobile {
    @Override
    public void cost() {
        System.out.println("Nokia Mobile cost 20000");
    }

    @Override
    public void pictureQuality() {
        System.out.println("Nokia Picture quality 1080P");
    }

    @Override
    public void batterCapacity() {
        System.out.println("Nokia Battery capacity 5200 Mah");
    }
}
