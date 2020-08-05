package com.designPatterns.structural.Adapter.solution;

import com.designPatterns.structural.Adapter.solution.otherLibrary.Caramel;

public class CaramelFilter implements Filter {

    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
    }
}
