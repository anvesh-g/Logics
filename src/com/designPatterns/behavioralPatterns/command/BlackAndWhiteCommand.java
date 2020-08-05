package com.designPatterns.behavioralPatterns.command;

import com.designPatterns.behavioralPatterns.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and white filter");
    }
}
