package com.designPatterns.behavioralPatterns.mediator.usingObserver;

import com.designPatterns.behavioralPatterns.mediator.usingObserver.fx.Button;
import com.designPatterns.behavioralPatterns.mediator.usingObserver.fx.ListBox;
import com.designPatterns.behavioralPatterns.mediator.usingObserver.fx.TextBox;

public class ArticlesDialogBox {
    private ListBox listBox=new ListBox();
    private TextBox textBox=new TextBox();
    private Button button=new Button();

    public ArticlesDialogBox() {
//        listBox.attach(()->articleSelected());
        listBox.attach(this::articleSelected);
        textBox.attach(this::titleChanged);
    }

    public void simulateUserInteraction(){
        listBox.setSelection("Article 1");
        System.out.println("TextBox: "+textBox.getContent());
        System.out.println("Button: "+button.isEnabled());
    }

    private void titleChanged(){
        String content=textBox.getContent();
        boolean isEmpty=(content==null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        textBox.setContent(listBox.getSelection());
        button.setEnabled(true);
    }
}
