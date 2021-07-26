package com.designPatterns.behavioralPatterns.strategy.anotherExample;

public class SelectionSortStrategy implements Strategy {

    @Override
    public void sort(int[] numbers) {
        System.out.println("selection sort");
    }
}
