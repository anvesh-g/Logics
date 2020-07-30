package com.designPatterns.template;

public class TransferMoney extends Task {
    @Override
    protected void doExecute() {
        System.out.println("Transfer money");
    }
}
