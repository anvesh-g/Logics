package com.designPatterns.structuralPatterns.Adapter.problem;

public class VividFilter implements Filter {
    @Override
    public void apply(Image image) {
        System.out.println("Applying vivid filter on image "+image.getName());
    }
}
