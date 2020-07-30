package com.designPatterns.command;

import com.designPatterns.command.fx.Button;
import com.designPatterns.command.fx.Command;

public class Driver {
    public static void main(String[] args) {
        CustomerService service=new CustomerService();
        Command command=new AddCustomerCommand(service);
        Button btn=new Button(command);
        btn.click();

        var composite=new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

    }
}
