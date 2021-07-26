package com.designPatterns.behavioralPatterns.mediator.anotherExample;

public class ColleagueB extends Colleague {

    public ColleagueB(IMediator iMediator){
        this.iMediator=iMediator;
        this.iMediator.registerColleagueB(this);

    }


    @Override
    public void doSomething() {
        this.iMediator.fight();
    }
}
