package com.designPatterns.behavioralPatterns.strategy;

public class Driver {
    public static void main(String[] args) {
        var imageStorage=new ImageStorage();
        imageStorage.store("ABC",new JPEGCompressor(),new BlackAndWhiteFilter());
        imageStorage.store("XYZ",new PNGCompressor(),new BlackAndWhiteFilter());
    }
}
