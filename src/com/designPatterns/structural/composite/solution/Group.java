package com.designPatterns.structural.composite.solution;

import java.util.ArrayList;
import java.util.List;

public class Group implements Composite {
    private List<Composite> composites=new ArrayList<>();

    public void add(Composite composite){
        composites.add(composite);
    }

    @Override
    public void render() {
        for (Composite composite:composites) {
            composite.render();
        }
    }

    @Override
    public void move() {
        for (Composite composite:composites) {
            composite.move();
        }
    }
}
