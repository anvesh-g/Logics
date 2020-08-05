package com.designPatterns.structural.composite.problem;

public class Driver {
    public static void main(String[] args) {
        Group g1=new Group();
        g1.add(new Shape("Square 1")); //square 1
        g1.add(new Shape("square 2"));// square 2

        Group g2=new Group();
        g2.add(new Shape("Circle 1")); // Circle 1
        g2.add(new Shape("Circle 2")); // Circle 2

        Group g=new Group();
        g.add(g1);
        g.add(g2);

        g.render();
    }
}
