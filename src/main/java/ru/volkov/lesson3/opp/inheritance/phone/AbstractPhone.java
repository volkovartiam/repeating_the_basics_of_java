package ru.volkov.lesson3.opp.inheritance.phone;

public abstract class AbstractPhone {
    private int year;

    public AbstractPhone(int year) {
        this.year = year;
    }
    public abstract void call(int outputNumber);
    public abstract void ring (int inputNumber);
}
