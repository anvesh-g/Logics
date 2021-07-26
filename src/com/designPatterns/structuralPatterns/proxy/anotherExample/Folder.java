package com.designPatterns.structuralPatterns.proxy.anotherExample;

public class Folder implements IFolder {
    @Override
    public void performOperations() {
        System.out.println("Performing operations on folder");
    }
}
