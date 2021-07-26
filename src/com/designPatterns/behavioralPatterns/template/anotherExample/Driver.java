package com.designPatterns.behavioralPatterns.template.anotherExample;

public class Driver {
    public static void main(String[] args) {
        PurchareOrderTemplate pot1=new StorePurchaseOrder();
        pot1.processOrder();
        PurchareOrderTemplate pot2=new OnlinePurchaseOrder();
        pot2.processOrder();
    }
}
