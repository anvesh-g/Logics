package com.designPatterns.behavioralPatterns.strategy.anotherExample;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] numbers){
        strategy.sort(numbers);
    }
}
