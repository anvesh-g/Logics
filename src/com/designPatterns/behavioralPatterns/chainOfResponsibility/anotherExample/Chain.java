package com.designPatterns.behavioralPatterns.chainOfResponsibility.anotherExample;

public interface Chain {
    void setNext(Chain c);
    void process(Number request);
}
