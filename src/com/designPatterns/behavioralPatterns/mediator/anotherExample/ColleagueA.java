package com.designPatterns.behavioralPatterns.mediator.anotherExample;

public class ColleagueA extends Colleague {

    public ColleagueA(IMediator iMediator){
        this.iMediator=iMediator;
        this.iMediator.registerColleagueA(this);

    }

    @Override
    public void doSomething() {
        this.iMediator.talk();
    }
}
