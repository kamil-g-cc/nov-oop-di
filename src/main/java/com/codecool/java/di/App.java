package com.codecool.java.di;

public class App {
    public static void main(String[] args) {
        MyConsumer app = new MyConsumer();
        EmailService service = new EmailService();
        app.configure(service);
        app.processMessages("Hi, how are you?", "kamil@codecool.com");
    }
}
