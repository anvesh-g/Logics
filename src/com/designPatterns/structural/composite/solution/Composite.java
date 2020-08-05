package com.designPatterns.structural.composite.solution;

public interface Composite {
    void render();


    //so if we are adding a new method we are explicitly changing
    // every object in the heirarchy
    void move();
}
