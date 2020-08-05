package com.designPatterns.structural.Adapter.excercise.otherEmailProvider;

import com.designPatterns.structural.Adapter.excercise.Email;

public class Gmail {
    private String servername;

    public void init(String servername){
        this.servername=servername;
    }

    public void pushMail(Email email){
        System.out.println("Sending mail via "+servername+" .."+email.getEmailContent());
    }

}
