package com.designPatterns.structural.Adapter.solution;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Applying vivid Filter on "+image.getName());
    }
}
