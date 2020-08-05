package com.designPatterns.structural.Adapter.excercise;

public class EmailClient {
    private Email email;

    public EmailClient(Email email) {
        this.email = email;
    }

    public void send(EmailProvider emailProvider){
        emailProvider.sendEmail(email);
    }
}
