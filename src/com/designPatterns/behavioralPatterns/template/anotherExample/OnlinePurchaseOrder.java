package com.designPatterns.behavioralPatterns.template.anotherExample;

public class OnlinePurchaseOrder extends PurchareOrderTemplate {

    @Override
    public void doSelect() {
        System.out.println("Select online item");
    }

    @Override
    public void doPayment() {
        System.out.println("online payment");
    }

    @Override
    public void doDelivery() {
        System.out.println("delivery for online order");
    }
}
