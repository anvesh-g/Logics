package com.designPatterns.state;

public class Driver {
    public static void main(String[] args) {
        var canvas=new Canvas();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }


}
