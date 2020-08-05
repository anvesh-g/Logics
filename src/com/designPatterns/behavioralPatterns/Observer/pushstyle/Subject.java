package com.designPatterns.behavioralPatterns.Observer.pushstyle;

import java.util.ArrayList;
import java.util.List;

//Observable
public class Subject {
    private List<Observer> observers=new ArrayList<>();
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void notifyObserver(int value){
        for (Observer obs:observers) {
            obs.update(value);
        }
    }
}
