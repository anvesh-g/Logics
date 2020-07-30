package com.designPatterns.state.abuse.designSmell;

public class Driver {
    public static void main(String[] args) {
        var stopWatch=new StopWatch();
        stopWatch.click();
        stopWatch.click();
        stopWatch.click();
    }
}
