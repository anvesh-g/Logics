package com.designPatterns.structuralPatterns.decorator.exercise;


public class Driver {
    public static void main(String[] args) {
        Artefact artefact=new ErrorIcon(new EditiorIcon(new MainIcon()));
        artefact.artifactName(" Main");
    }
}
