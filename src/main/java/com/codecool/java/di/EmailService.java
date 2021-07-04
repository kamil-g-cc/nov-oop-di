package com.codecool.java.di;

public class EmailService {
    public void sendEmail(String message, String receiver){
        //logic...
        System.out.println("Sending e-mail to "+ receiver+ " with message = "+message);
    }
}
