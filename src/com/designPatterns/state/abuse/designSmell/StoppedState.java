package com.designPatterns.state.abuse.designSmell;

public class StoppedState implements State {
    private StopWatch stopWatch;
    public StoppedState(StopWatch stopWatch) {
        this.stopWatch=stopWatch;
    }

    @Override
    public void click() {
        stopWatch.setCurrentState(new RunningState(stopWatch));
        System.out.println("Stopped");
    }
}
