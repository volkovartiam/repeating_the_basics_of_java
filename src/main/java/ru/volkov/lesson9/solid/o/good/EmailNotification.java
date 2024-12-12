package ru.volkov.lesson9.solid.o.good;

public class EmailNotification implements NotificationService{
    @Override
    public void sendMessage(String message) {
        //write email
        //use JavaMailSenderAPI
    }
}
