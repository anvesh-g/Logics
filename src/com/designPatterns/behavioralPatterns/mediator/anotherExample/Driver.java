package com.designPatterns.behavioralPatterns.mediator.anotherExample;

public class Driver {
    public static void main(String[] args) {
        IMediator iMediator=new ConcreteMediator();

        ColleagueA ca=new ColleagueA(iMediator);
        ca.doSomething();


        ColleagueB cb=new ColleagueB(iMediator);
        cb.doSomething();
    }
}
