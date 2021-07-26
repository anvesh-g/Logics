package com.designPatterns.behavioralPatterns.state.anotherExample;

public class MobileContext implements MobileState {
    private MobileState mobileState;

    public MobileContext(MobileState mobileState) {
        this.mobileState = mobileState;
    }

    public void setMobileState(MobileState mobileState) {
        this.mobileState = mobileState;
    }

    @Override
    public void getState() {
        mobileState.getState();
    }
}
