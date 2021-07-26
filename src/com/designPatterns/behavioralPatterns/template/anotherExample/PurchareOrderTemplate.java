package com.designPatterns.behavioralPatterns.template.anotherExample;

public abstract class PurchareOrderTemplate {

    public abstract void doSelect();
    public abstract void doPayment();
    public final void doPack(){
        System.out.println("Gift wrap done");
    }
    public abstract void doDelivery();
    public final void processOrder(){
        doSelect();
        doPayment();
        doPack();
        doDelivery();
    }


}
