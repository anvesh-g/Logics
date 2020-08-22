package com.designPatterns.structuralPatterns.decorator.problem;

public class CompressionData  extends  CloudStream{
    @Override
    public void write(String data) {
        String compressData=compress(data);
        super.write(compressData);
    }

    public String compress(String data){
        return data.substring(0,5);
    }
}
