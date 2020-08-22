package com.designPatterns.structuralPatterns.decorator.problem;

public class EncryptData extends CloudStream {
    @Override
    public void write(String data) {
        String encryptedData=encrypt(data);
        super.write(encryptedData);
    }

    public String encrypt(String data){
        return "asdgre"+data+"asdf";
    }
}
