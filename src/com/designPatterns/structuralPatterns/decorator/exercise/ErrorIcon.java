package com.designPatterns.structuralPatterns.decorator.exercise;

public class ErrorIcon implements Artefact {

    private Artefact artefact;

    public ErrorIcon(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public void artifactName(String name) {
        artefact.artifactName("Errror "+name);
    }
}
