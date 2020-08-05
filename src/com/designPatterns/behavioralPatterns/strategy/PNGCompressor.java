package com.designPatterns.behavioralPatterns.strategy;

public class PNGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Applying PNG Compressor to the "+fileName);
    }
}
