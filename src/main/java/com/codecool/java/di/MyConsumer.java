package com.codecool.java.di;

public class MyConsumer {
    private MessageService email = null;

    public MyConsumer(MessageService srv){
        email = srv;
    }
    public void processMessages(String msg, String receiver){
        //logic for msg and receiver validation
        email.sendMessage(msg, receiver);
    }
}
