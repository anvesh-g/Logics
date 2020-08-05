package com.designPatterns.structural.Adapter.problem.otherLibrary;

import com.designPatterns.structural.Adapter.problem.Image;

public class CaramelFilter {
    public void init(){

    }

    public void render(Image image){
        System.out.println("Caramel filter on "+image.getName());
    }
}
