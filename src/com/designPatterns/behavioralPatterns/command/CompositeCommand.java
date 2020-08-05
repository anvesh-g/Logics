package com.designPatterns.behavioralPatterns.command;

import com.designPatterns.behavioralPatterns.command.fx.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {

    private List<Command> commands=new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for (Command c: commands) {
            c.execute();
        }
    }
}
