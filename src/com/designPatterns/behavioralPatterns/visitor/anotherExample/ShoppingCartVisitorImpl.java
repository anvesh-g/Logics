package com.designPatterns.behavioralPatterns.visitor.anotherExample;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public int visit(Book book) {
        int cost=0;
        if(book.getPrice()>50){
            //discont
            cost=book.getPrice()-5;
        }else{
            cost=book.getPrice();
        }
        System.out.println("Book ISBN "+book.getIsbnNumber()+" cost "+book.getPrice());
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost=fruit.getPricePerPackage()*fruit.getWeight();
        System.out.println(fruit.getName()+" cost "+cost);
        return cost;
    }
}
