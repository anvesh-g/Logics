package com.designPatterns.structuralPatterns.decorator.problem;

public class Driver {
    public static void main(String[] args) {
        CloudStream cloudStream=new CloudStream();
        cloudStream.write("Save to cloud");

        CloudStream cloudStream1=new EncryptData();
        cloudStream1.write("Save to Cloud");

        CloudStream compress=new CompressionData();
        compress.write("compresss and save");

        // if we to use use both compression and encryption the again we need to extra class
    }
}
