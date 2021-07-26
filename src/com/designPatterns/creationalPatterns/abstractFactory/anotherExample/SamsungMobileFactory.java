package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;

public class SamsungMobileFactory extends MobileFactory{
    Samsung createSamsungMobile(){
        return new Samsung();
    }
}
