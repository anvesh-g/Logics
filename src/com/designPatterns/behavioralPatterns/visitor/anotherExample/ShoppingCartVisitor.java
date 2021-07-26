package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
