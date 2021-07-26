package com.designPatterns.structuralPatterns.composite.anotherExample;

import java.util.ArrayList;
import java.util.List;

public class Manager implements  Employee {

    List<Employee> employees= new ArrayList<>();

    private String name;
    private double salary;


    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }



    @Override
    public void add(Employee e) {
        employees.add(e);
    }

    @Override
    public void remove(Employee e) {
        employees.remove(e);
    }

    @Override
    public Employee getChild(int i) {
        return employees.get(i);
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
    public void policy() {
        System.out.println("Manager Policy");
    }

    @Override
    public void print() {
        System.out.println("Name "+name);
        System.out.println("Salary "+salary);
        employees.stream().forEach(e->{
            e.print();
        });

    }
}
