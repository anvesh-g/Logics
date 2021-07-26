package com.designPatterns.creationalPatterns.builder.firstMethod;

public class Driver {
    public static void main(String[] args) {
        TaskBuilder t=new TaskBuilder(504);
        Task task= new Task(t);
        System.out.println(task.toString());
    }
}
