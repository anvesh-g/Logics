package com.designPatterns.behavioralPatterns.strategy.anotherExample;

public class Driver {
    public static void main(String[] args) {
        int[] numbers={5,4,3,2,1};

        Context ctx=new Context(new SelectionSortStrategy());
        ctx.arrange(numbers);

        Context ctx2=new Context(new BubbleSortStrategy());
        ctx2.arrange(numbers);
    }
}