package com.designPatterns.structuralPatterns.proxy.anotherExample;

public class Driver {
    public static void main(String[] args) {
        User user=new User("dev","dev");
        FolderProxy proxy= new FolderProxy(user);
        System.out.println("user dev pwd dev");
        proxy.performOperations();

        User user2=new User("dev","dev123");
        FolderProxy proxy2=new FolderProxy(user2);
        System.out.println("user dev pwd wrong");
        proxy2.performOperations();
    }
}
