package com.designPatterns.structuralPatterns.decorator.solution;

public class EncryptedCloudStream implements Stream {

    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encryptedData=encrypt(data);
        stream.write(encryptedData);
    }

    public String encrypt(String data){
        return "asd "+data+" sdv";
    }
}
