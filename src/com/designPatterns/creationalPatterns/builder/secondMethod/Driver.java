package com.designPatterns.creationalPatterns.builder.secondMethod;

public class Driver {
    public static void main(String[] args) {
        User user1=new User.UserBuilder("anvesh","gatadi")
                .age(28)
                .address("Hyd")
                .build();
        System.out.println(user1.toString());
    }
}
