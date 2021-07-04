package com.codecool.java.di;

public class App {
    public static void main(String[] args) {
        MyConsumer app = new MyConsumer();
        app.processMessages("Hi, how are you?", "kamil@codecool.com");
    }
}
