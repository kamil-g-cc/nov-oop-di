package com.codecool.java.di;

public class SMSService implements MessageService{

    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("Sending SMS to "+ receiver+ " with message = "+msg);
    }
}
