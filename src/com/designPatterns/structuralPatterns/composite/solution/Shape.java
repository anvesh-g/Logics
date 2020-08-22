package com.designPatterns.structuralPatterns.composite.solution;

public class Shape implements Composite{
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        System.out.println("move "+name);
    }

    @Override
    public void render() {
        System.out.println("render shape "+name);
    }
}
