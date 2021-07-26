package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public class Fruit implements ShoppingCartElement {

    private int pricePerPackage;
    private int weight;
    private String name;

    public Fruit(int pricePerPackage, int weight, String name) {
        this.pricePerPackage = pricePerPackage;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }

    public int getPricePerPackage() {
        return pricePerPackage;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
