package com.designPatterns.structural.composite.problem;

public class Shape {
    private String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    public void render(){
        System.out.println("render shape "+shape);
    }
}
