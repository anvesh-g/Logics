package com.designPatterns.behavioralPatterns.chainOfResponsibility.anotherExample;

public class NegativeNumberProcessor implements Chain {

    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        this.nextInChain=c;
    }

    @Override
    public void process(Number request) {
        if(request.getNumber()<0){
            System.out.println("-ve "+request.getNumber());
        }else{
            nextInChain.process(request);
        }
    }
}
