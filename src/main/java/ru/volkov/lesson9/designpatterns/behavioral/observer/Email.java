package ru.volkov.lesson9.designpatterns.behavioral.observer;

public class Email implements Observer {
    @Override
    public void update(float interest) {
        System.out.println("Email: Interest Rate updated, new Rate is: "
                           + interest);
    }
}
