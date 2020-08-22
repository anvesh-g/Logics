package com.designPatterns.structuralPatterns.composite.problem;

import java.util.ArrayList;
import java.util.List;

public class Group {
    List<Object> objects=new ArrayList<>();


    public void add(Object object){
        objects.add(object);
    }

    public void render(){
        //If more functionality is added in Shape we need to
        // keep on changing the code

        for (Object object:objects) {
            if(object instanceof Shape){
                ((Shape)object).render();
            }else{
                ((Group)object).render();
            }
        }
    }
}
