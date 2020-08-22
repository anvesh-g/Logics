package com.designPatterns.structuralPatterns.flyweight.solution;

public class Driver {
    public static void main(String[] args) {
        PointService service=new PointService(new PointIconFactory());
        for (Point p: service.getPoints()) {
            p.draw();
        }

        // P is heavy weight object with all fields in it
        // common fields like PointType and icon can separated
    }
}
