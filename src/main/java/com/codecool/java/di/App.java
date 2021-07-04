package com.codecool.java.di;

public class App {
    public static void main(String[] args) {
        /*EmailService service = new EmailService();
        MyConsumer app = new MyConsumer(service);
        app.processMessages("Hi, how are you?", "kamil@codecool.com");
        */
        EmailServiceInjector injector = new EmailServiceInjector();
        injector.getMessageServiceConsumer().processMessages("Hi, how are you?", "kamil@codecool.com");

        SMSServiceInjector injectorSMS = new SMSServiceInjector();
        injectorSMS.getMessageServiceConsumer().processMessages("Hi, this is SMS", "+48600099971");
    }
}
