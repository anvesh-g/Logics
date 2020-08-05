package com.designPatterns.structural.Adapter.problem;



public class Driver {
    public static void main(String[] args) {
        ImageView imageView=new ImageView(new Image("bird"));
        imageView.apply(new VividFilter());

        // Here we cannot add caramel filter doesn't match with what apply() expects
        //In this scenario we can use adapter pattern which converts interface of different
        // form to required form
//        imageView.apply(new CaramelFilter());
    }
}
