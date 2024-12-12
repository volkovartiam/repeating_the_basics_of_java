package ru.volkov.lesson9.solid.d.good;

import java.math.BigDecimal;
import java.util.List;

public class Shop {
    private Payments payments;

    public Shop(Payments payments) {
        this.payments = payments;
    }

    public void doPayment(Object order, BigDecimal amount){
        payments.doTransaction(amount);
    }
}
