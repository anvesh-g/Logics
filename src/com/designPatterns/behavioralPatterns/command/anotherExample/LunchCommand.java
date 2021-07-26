package com.designPatterns.behavioralPatterns.command.anotherExample;

public class LunchCommand implements Command {

    Lunch lunch;

    public LunchCommand(Lunch lunch) {
        this.lunch = lunch;
    }

    @Override
    public void execute() {
        lunch.makeLunch();
    }
}
