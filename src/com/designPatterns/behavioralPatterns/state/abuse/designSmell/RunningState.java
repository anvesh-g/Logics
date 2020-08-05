package com.designPatterns.behavioralPatterns.state.abuse.designSmell;

public class RunningState implements State {
    private StopWatch stopWatch;

    public RunningState(StopWatch stopWatch) {
        this.stopWatch = stopWatch;
    }


    @Override
    public void click() {
        stopWatch.setCurrentState(new StoppedState(stopWatch));
        System.out.println("Running");
    }
}
