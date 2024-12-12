package ru.volkov.lesson9.solid.d.bad;

import java.math.BigDecimal;

public class Shop {
    private Cash cash;
    public Shop(Cash cash) {
        this.cash = cash;
    }
    public void doPayment(Object order, BigDecimal amount){
        cash.doTransaction(amount);
    }
}
