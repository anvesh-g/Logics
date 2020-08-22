package com.designPatterns.structuralPatterns.Adapter.excercise;

import com.designPatterns.structuralPatterns.Adapter.excercise.otherEmailProvider.Gmail;

public class GmailAdapter implements EmailProvider{

    private Gmail gmail;

    public GmailAdapter(Gmail gmail) {
        this.gmail = gmail;
    }

    @Override
    public void sendEmail(Email email) {
        gmail.init("gmail server");
        gmail.pushMail(email);
    }
}
