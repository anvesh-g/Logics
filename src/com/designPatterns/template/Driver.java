package com.designPatterns.template;

public class Driver {
    public static void main(String[] args) {
        TransferMoney transferMoney=new TransferMoney();
        transferMoney.execute();

        GenerateReport gr=new GenerateReport();
        gr.execute();
    }
}
