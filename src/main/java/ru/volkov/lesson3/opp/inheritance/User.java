package ru.volkov.lesson3.opp.inheritance;

import ru.volkov.lesson3.opp.inheritance.phone.AbstractPhone;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void callAnotherUser(int number, AbstractPhone phone) {
// вот он полиморфизм - использование в коде абстактного типа AbstractPhone phone!
        phone.call(number);
    }
}
