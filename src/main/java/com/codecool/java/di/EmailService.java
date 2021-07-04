package com.codecool.java.di;

public class EmailService implements MessageService{
    @Override
    public void sendMessage(String msg, String receiver) {
        System.out.println("Sending e-mail to "+ receiver+ " with message = "+msg);
        //przerwa do 10:10 :)
    }
}
