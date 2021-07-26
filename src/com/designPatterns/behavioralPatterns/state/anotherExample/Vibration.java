    package com.designPatterns.behavioralPatterns.state.anotherExample;

    public class Vibration implements MobileState {

        @Override
        public void getState() {
            System.out.println("Vibrating");
        }
    }
