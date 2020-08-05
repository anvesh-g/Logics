package com.designPatterns.behavioralPatterns.mediator.general.fx;

import com.designPatterns.behavioralPatterns.mediator.general.DialogBox;

public class ListBox extends UIControl {
    private String selection;

    public ListBox(DialogBox owner) {
        super(owner);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        owner.changed(this);
    }

}
