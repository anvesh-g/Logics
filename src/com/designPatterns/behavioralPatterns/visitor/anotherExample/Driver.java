package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public class Driver {

    public static void main(String[] args) {
        ShoppingCartElement[] items=new ShoppingCartElement[]{
                new Book(100,"A3R41"),
                new Fruit(10, 5,"Apple"),
                new Book(200,"QWX1C")
        };

        int cost= calculateTotalCost(items);
        System.out.println("Total cost "+cost);
    }

    public static int calculateTotalCost(ShoppingCartElement[] items){
        ShoppingCartVisitor visitor=new ShoppingCartVisitorImpl();
        int totalCost=0;
        for (ShoppingCartElement item : items) {
            totalCost=totalCost+item.accept(visitor);
        }

        return totalCost;
    }
}
