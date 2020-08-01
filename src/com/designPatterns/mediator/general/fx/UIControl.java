package com.designPatterns.mediator.general.fx;

import com.designPatterns.mediator.general.DialogBox;

public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox dialogBox) {
        this.owner = dialogBox;
    }
}
