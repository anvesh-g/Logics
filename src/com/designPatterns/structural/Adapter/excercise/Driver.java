package com.designPatterns.structural.Adapter.excercise;

import com.designPatterns.structural.Adapter.excercise.otherEmailProvider.Gmail;

public class Driver {
    public static void main(String[] args) {
        EmailClient emailClient =new EmailClient(new Email("Hi Hello"));
        emailClient.send(new Outlook("outlook"));

        emailClient.send(new GmailAdapter(new Gmail()));


    }
}
