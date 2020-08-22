package com.designPatterns.structuralPatterns.decorator.solution;

public class CompressCloudStream implements Stream{

    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String comressData=compress(data);
        stream.write(comressData);
    }

    public String compress(String data){
        return data.substring(0,4);
    }
}
