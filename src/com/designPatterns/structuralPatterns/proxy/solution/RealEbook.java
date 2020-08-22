package com.designPatterns.structuralPatterns.proxy.solution;

public class RealEbook implements Ebook{
    private String fileName;

    public RealEbook(String fileName) {
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
