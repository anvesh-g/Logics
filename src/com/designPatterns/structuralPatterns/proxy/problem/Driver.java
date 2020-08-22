package com.designPatterns.structuralPatterns.proxy.problem;

public class Driver {
    public static void main(String[] args) {
        Library library =new Library();
        String[] fileNames= {"a","b","c","d"};
        for (String fileName : fileNames) {
            library.add(new Ebook(fileName));
        }
        library.openEbook("a");
    }
}
