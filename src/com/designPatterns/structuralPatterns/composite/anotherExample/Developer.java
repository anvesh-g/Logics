package com.designPatterns.structuralPatterns.composite.anotherExample;

public class Developer implements Employee {

    private String name;
    private double salary;

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void add(Employee e) {

    }

    @Override
    public void remove(Employee e) {

    }

    @Override
    public Employee getChild(int i) {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);

    }

    @Override
    public void policy() {
        System.out.println("Emp Policy");
    }
}
