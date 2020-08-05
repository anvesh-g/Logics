package com.designPatterns.behavioralPatterns.visitor;

public class HighlightOperation implements Operation{
    @Override
    public void apply(HeadingNode hNode) {
        System.out.println("Highlight heading");
    }

    @Override
    public void apply(AnchorNode aNode) {
        System.out.println("Highlight anchor");
    }
}
