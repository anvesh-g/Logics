package com.designPatterns.structuralPatterns.composite.anotherExample;

public interface Employee {

    public void policy();

    public void add(Employee e);

    public void remove(Employee e);

    public Employee getChild(int i);

    public String getName();

    public double getSalary();

    public void print();
}
