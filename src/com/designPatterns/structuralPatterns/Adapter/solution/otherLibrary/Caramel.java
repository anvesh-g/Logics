package com.designPatterns.structuralPatterns.Adapter.solution.otherLibrary;

import com.designPatterns.structuralPatterns.Adapter.solution.Image;

public class Caramel {
    public void init(){

    }

    public void render(Image image){
        System.out.println("Caramel Filter on "+image.getName());
    }
}
