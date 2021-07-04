package com.codecool.java.di;

public class SMSServiceInjector implements MessageServiceInjector{
    @Override
    public MessageServiceConsumer getMessageServiceConsumer() {
        return new MyConsumer(new SMSService());
    }
}

