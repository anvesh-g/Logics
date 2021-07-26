package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;

public class Driver {
    public static void main(String[] args) {
        MobileFactory factory=new MobileFactory();
        NokiaMobileFactory imf=(NokiaMobileFactory)factory.createMobile("Nokf");
        Nokia nokia=imf.createNokiaMobile();
        nokia.batterCapacity();
        nokia.cost();
        nokia.pictureQuality();
    }
}
