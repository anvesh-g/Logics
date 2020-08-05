package com.designPatterns.structural.Adapter.excercise;

public class Outlook implements EmailProvider {
    private String mailserver;

    public Outlook(String mailserver) {
        this.mailserver = mailserver;
    }

    @Override
    public void sendEmail(Email email) {
        System.out.println("Sending email via "+ mailserver+ " ... "+email.getEmailContent());
    }

    public String getMailserver() {
        return mailserver;
    }

    public void setMailserver(String mailserver) {
        this.mailserver = mailserver;
    }
}
