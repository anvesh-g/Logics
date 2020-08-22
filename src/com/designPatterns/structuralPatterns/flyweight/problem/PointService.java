package com.designPatterns.structuralPatterns.flyweight.problem;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    public List<Point> getPoints(){
        List<Point> points=new ArrayList<>();
        Point p=new Point(1,2,PointType.CAFE,null);
        points.add(p);
        return points;
    }
}
