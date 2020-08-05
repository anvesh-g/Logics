package com.designPatterns.behavioralPatterns.mediator.general;

import com.designPatterns.behavioralPatterns.mediator.general.fx.UIControl;
//Mediator
public abstract class DialogBox {
    public abstract void changed(UIControl uiControl);
}
