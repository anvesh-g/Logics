package com.designPatterns.structuralPatterns.Adapter.solution;

import com.designPatterns.structuralPatterns.Adapter.solution.otherLibrary.Caramel;

public class Driver {
    public static void main(String[] args) {
        ImageView imageView=new ImageView(new Image("Tiger"));
        imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
        // CaramelFilter --> Adapter
        // Caramel --> Adoptee
    }
}
