package com.set_1.go.classes;

import java.util.Date;

public class Employee {
    private int id;
    private String name;
    private long date;

    public Employee(int id, String name, long date){
        this.id=id;
        this.name=name;
        this.date=date;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
