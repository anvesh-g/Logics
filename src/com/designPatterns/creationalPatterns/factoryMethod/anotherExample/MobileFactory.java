package com.designPatterns.creationalPatterns.factoryMethod.anotherExample;

public class MobileFactory {

    public MobileFactory(){

    }

    IMobile createMobile(String type){
        IMobile iMobile=null;
        if("Nokia".equalsIgnoreCase(type)){
            iMobile=new Nokia();
            System.out.println("Nokia Created");
        }else if("Samsung".equalsIgnoreCase(type)){
            iMobile=new Samsung();
            System.out.println("Samsung Created");
        }
        return iMobile;
    }
}
