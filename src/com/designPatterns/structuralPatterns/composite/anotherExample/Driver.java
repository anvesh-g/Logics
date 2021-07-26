package com.designPatterns.structuralPatterns.composite.anotherExample;

public class Driver {
    public static void main(String[] args) {
        Employee e1=new Developer("Rohit",1000);
        Employee e2=new Developer("Virat",2000);
        Employee m1=new Manager("shastri",3000);

        m1.add(e1);
        m1.add(e2);

        Employee e3=new Developer("Smith",2000);
        Employee m2=new Manager("Hussey",3000);
        m2.add(e3);
        m2.add(m1);
        m2.print();

        m2.policy();

    }
}
