package com.designPatterns.structuralPatterns.decorator.exercise;

public class MainIcon implements Artefact{
    @Override
    public void artifactName(String name) {
        System.out.println("Main icon "+name);
    }
}
