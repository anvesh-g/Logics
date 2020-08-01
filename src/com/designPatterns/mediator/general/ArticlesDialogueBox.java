package com.designPatterns.mediator.general;

import com.designPatterns.mediator.general.fx.Button;
import com.designPatterns.mediator.general.fx.ListBox;
import com.designPatterns.mediator.general.fx.TextBox;
import com.designPatterns.mediator.general.fx.UIControl;

public class ArticlesDialogueBox extends DialogBox{
    private ListBox  articlesListBox=new ListBox(this);
    private TextBox textBox=new TextBox(this);
    private Button button = new Button(this);
    @Override
    public void changed(UIControl uiControl) {
        if(uiControl == articlesListBox){
            articleSelected();
        }else if(uiControl == textBox){
            titleChanged();
        }

    }

    public void simulateUserInteraction(){
        articlesListBox.setSelection("Article 1");
        System.out.println("TextBox: "+textBox.getContent());
        System.out.println("Button: "+button.isEnabled());
    }

    private void titleChanged(){
        String content=textBox.getContent();
        boolean isEmpty=(content==null || content.isEmpty());
        button.setEnabled(!isEmpty);
    }

    private void articleSelected(){
        textBox.setContent(articlesListBox.getSelection());
        button.setEnabled(true);
    }
}
