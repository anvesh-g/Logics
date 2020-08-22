package com.designPatterns.structuralPatterns.decorator.solution;

public class Driver {
    public static void main(String[] args) {
        storeCreditCard(new CompressCloudStream(new EncryptedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream){
        stream.write("12450987");
    }
}
