package com.designPatterns.behavioralPatterns.mediator.usingObserver.fx;

import com.designPatterns.behavioralPatterns.mediator.usingObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

    private List<Observer> observers=new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    protected void notifyObservers(){
        for (Observer o: observers) {
            o.update();
        }
    }


}
