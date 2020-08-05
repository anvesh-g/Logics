package com.designPatterns.behavioralPatterns.visitor;

public class PlainTextOpertaion implements Operation {
    @Override
    public void apply(HeadingNode hNode) {
        System.out.println("heading text");
    }

    @Override
    public void apply(AnchorNode aNode) {
        System.out.println("anchor text");
    }
}
