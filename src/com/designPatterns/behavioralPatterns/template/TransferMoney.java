package com.designPatterns.behavioralPatterns.template;

public class TransferMoney extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
