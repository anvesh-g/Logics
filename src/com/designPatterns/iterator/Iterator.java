package com.designPatterns.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
