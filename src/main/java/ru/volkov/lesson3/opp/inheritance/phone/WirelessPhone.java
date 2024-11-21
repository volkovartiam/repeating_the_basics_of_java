package ru.volkov.lesson3.opp.inheritance.phone;

import ru.volkov.lesson3.opp.inheritance.phone.AbstractPhone;

public abstract class WirelessPhone extends AbstractPhone {

    private int hour;

    public WirelessPhone(int year, int hour) {
        super(year);
        this.hour = hour;
    }
}
