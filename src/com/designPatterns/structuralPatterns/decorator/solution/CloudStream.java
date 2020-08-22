package com.designPatterns.structuralPatterns.decorator.solution;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("data "+data);
    }
}
