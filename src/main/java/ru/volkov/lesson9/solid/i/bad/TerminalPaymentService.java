package ru.volkov.lesson9.solid.i.bad;

import ru.volkov.lesson9.solid.i.bad.exception.PaymantUnsupportedException;

public class TerminalPaymentService implements Payments{
    @Override
    public void payWebMoney() {
        //logic
    }
    @Override
    public void payCreditCard() {
        //logic
    }
    @Override
    public void payPhoneNumber() {
        throw new PaymantUnsupportedException();
    }
}
