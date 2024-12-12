package ru.volkov.lesson9.solid.o.bad;

public class NotificationService {
    public void sendMessage(String typeMessage, String message) {
        if (typeMessage.equals("email")) {
            //write email
            //use JavaMailSenderAPI
        }
        if (typeMessage.equals("sms")) {
            //write sms
            //send sms
        }
    }
}
