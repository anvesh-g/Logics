package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public class Book implements ShoppingCartElement {

    private int price;
    private String isbnNumber;

    public Book(int price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }




    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {
        return shoppingCartVisitor.visit(this);
    }


    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }
}
