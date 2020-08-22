package com.designPatterns.structuralPatterns.decorator.exercise;

public class EditiorIcon implements Artefact {

    private Artefact artefact;

    public EditiorIcon(Artefact artefact) {
        this.artefact = artefact;
    }

    @Override
    public void artifactName(String name) {
        name="Editor "+name;
        artefact.artifactName(name);
    }
}
