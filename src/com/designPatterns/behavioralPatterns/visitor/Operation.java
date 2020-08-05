package com.designPatterns.behavioralPatterns.visitor;
//Visitor
public interface Operation {
    void apply(HeadingNode hNode);
    void apply(AnchorNode aNode);
}
