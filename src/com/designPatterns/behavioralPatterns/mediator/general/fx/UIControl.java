package com.designPatterns.behavioralPatterns.mediator.general.fx;

import com.designPatterns.behavioralPatterns.mediator.general.DialogBox;

public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox dialogBox) {
        this.owner = dialogBox;
    }
}
