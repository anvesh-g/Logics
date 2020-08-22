package com.designPatterns.structuralPatterns.proxy.problem;

public class Ebook {
    private String fileName;

    public Ebook(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load(){
        System.out.println("loading the book "+fileName);
    }

    public void show(){
        System.out.println("Showing e book "+fileName);
    }

    public String getFileName() {
        return fileName;
    }
}
