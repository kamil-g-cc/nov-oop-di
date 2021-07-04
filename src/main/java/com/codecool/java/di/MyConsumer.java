package com.codecool.java.di;

public class MyConsumer {
    private EmailService email = null;

    public void configure(EmailService srv){
        email = srv;
    }
    public void processMessages(String msg, String receiver){
        //logic for msg and receiver validation
        email.sendEmail(msg, receiver);
    }
}
