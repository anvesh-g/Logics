package com.designPatterns.structuralPatterns.flyweight.solution;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory factory;

    public PointService(PointIconFactory factory) {
        this.factory = factory;
    }

    public List<Point> getPoints(){
        List<Point> points=new ArrayList<>();
        Point p=new Point(1,2,factory.getpointIcon(PointType.CAFE));
        points.add(p);
        return points;
    }
}
