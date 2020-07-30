package com.designPatterns.command;

import com.designPatterns.command.fx.Command;

public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    public AddCustomerCommand(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
