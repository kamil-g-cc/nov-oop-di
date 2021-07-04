package com.codecool.java.di;

public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public MessageServiceConsumer getMessageServiceConsumer() {
        return new MyConsumer(new EmailService());
    }
}
