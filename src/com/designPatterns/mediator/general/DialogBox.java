package com.designPatterns.mediator.general;

import com.designPatterns.mediator.general.fx.UIControl;
//Mediator
public abstract class DialogBox {
    public abstract void changed(UIControl uiControl);
}
