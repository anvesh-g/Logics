package com.designPatterns.behavioralPatterns.strategy;

public class JPEGCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Applying JPEG Compressor to the "+fileName);
    }
}
