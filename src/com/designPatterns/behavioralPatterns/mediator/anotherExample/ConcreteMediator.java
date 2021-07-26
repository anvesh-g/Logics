package com.designPatterns.behavioralPatterns.mediator.anotherExample;

public class ConcreteMediator implements IMediator {
    ColleagueA talk;
    ColleagueB fight;

    @Override
    public void talk() {
        System.out.println("Colleague A talks");
    }

    @Override
    public void fight() {
        System.out.println("Colleague B fights");
    }

    @Override
    public void registerColleagueA(ColleagueA ca) {
        this.talk=ca;
    }

    @Override
    public void registerColleagueB(ColleagueB cb) {
        this.fight=cb;
    }
}
