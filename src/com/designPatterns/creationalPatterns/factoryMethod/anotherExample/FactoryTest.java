package com.designPatterns.creationalPatterns.factoryMethod.anotherExample;

public class FactoryTest {
    public static void main(String[] args) {
        MobileFactory factory=new MobileFactory();
        Nokia nokia=(Nokia) factory.createMobile("Nokia");
        Samsung samsung=(Samsung) factory.createMobile("samsung");
        nokia.batterCapacity();
        nokia.pictureQuality();
        nokia.cost();
        samsung.batterCapacity();
        samsung.pictureQuality();
        samsung.cost();
    }
}
