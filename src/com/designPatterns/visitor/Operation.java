package com.designPatterns.visitor;
//Visitor
public interface Operation {
    void apply(HeadingNode hNode);
    void apply(AnchorNode aNode);
}
