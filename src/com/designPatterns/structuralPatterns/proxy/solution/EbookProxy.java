package com.designPatterns.structuralPatterns.proxy.solution;

public class EbookProxy implements Ebook {
    private String fileName;
    private RealEbook realEbook;

    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(realEbook ==null){
            realEbook=new RealEbook(fileName);
        }
        realEbook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
