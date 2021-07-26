package com.designPatterns.behavioralPatterns.strategy.anotherExample;

public class BubbleSortStrategy implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("Bubble sort");
    }
}
