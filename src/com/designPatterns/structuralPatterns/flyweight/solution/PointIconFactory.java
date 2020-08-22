package com.designPatterns.structuralPatterns.flyweight.solution;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType,PointIcon> icons=new HashMap();
    public PointIcon getpointIcon(PointType type){
        if(!icons.containsKey(type)){
            PointIcon icon=new PointIcon(type,null);
            icons.put(type,icon);
        }
        return icons.get(type);
    }
}
