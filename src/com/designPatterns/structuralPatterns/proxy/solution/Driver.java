package com.designPatterns.structuralPatterns.proxy.solution;

public class Driver {
    public static void main(String[] args) {
        Library library =new Library();
        String[] fileNames= {"a","b","c","d"};
        for (String fileName : fileNames) {
            library.add(new EbookProxy(fileName));
        }
        library.openEbook("a");
        library.openEbook("b");
    }
}
