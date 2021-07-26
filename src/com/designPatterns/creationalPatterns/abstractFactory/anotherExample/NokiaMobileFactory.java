package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;

public class NokiaMobileFactory extends MobileFactory{
    Nokia createNokiaMobile(){
        return new Nokia();
    }
}
