package com.designPatterns.creationalPatterns.abstractFactory.anotherExample;

public class MobileFactory implements IMobileFactory {

    @Override
    public IMobileFactory createMobile(String type) {
        IMobileFactory mob=null;
        if("Nokf".equalsIgnoreCase(type)){
            mob=new NokiaMobileFactory();
        }else if("Samf".equalsIgnoreCase(type)){
            mob=new SamsungMobileFactory();
        }
        return mob;
    }
}
