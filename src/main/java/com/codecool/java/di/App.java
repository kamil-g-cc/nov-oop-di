package com.codecool.java.di;

public class App {
    public static void main(String[] args) {
        EmailService service = new EmailService();
        MyConsumer app = new MyConsumer(service);
        app.processMessages("Hi, how are you?", "kamil@codecool.com");
    }
}
