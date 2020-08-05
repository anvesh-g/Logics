package com.designPatterns.behavioralPatterns.command;

import com.designPatterns.behavioralPatterns.command.fx.Button;
import com.designPatterns.behavioralPatterns.command.fx.Command;

public class Driver {
    public static void main(String[] args) {
        CustomerService service=new CustomerService();
        Command command=new AddCustomerCommand(service);
        Button btn=new Button(command);
        btn.click();

        CompositeCommand composite=new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

    }
}
