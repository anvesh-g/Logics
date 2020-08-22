package com.designPatterns.structuralPatterns.composite.solution;

public class Driver {
    public static void main(String[] args) {
        Group group1=new Group();
        group1.add(new Shape("square 1"));
        group1.add(new Shape("square 2"));

        Group group2=new Group();
        group2.add(new Shape("circle 1"));
        group2.add(new Shape("circle 2"));

        Group g=new Group();
        g.add(group1);
        g.add(group2);

        g.render();
        g.move();

    }
}
