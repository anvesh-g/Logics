package com.designPatterns.behavioralPatterns.template.anotherExample;

public class StorePurchaseOrder extends PurchareOrderTemplate {

    @Override
    public void doSelect() {
        System.out.println("Select offline item");
    }

    @Override
    public void doPayment() {
        System.out.println("do offline payment");
    }

    @Override
    public void doDelivery() {
        System.out.println("do delivery");
    }
}
