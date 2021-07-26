package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public interface ShoppingCartElement {
    int accept(ShoppingCartVisitor shoppingCartVisitor);
}
