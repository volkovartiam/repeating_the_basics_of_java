package ru.volkov.lesson9.solid.d.good;

import java.math.BigDecimal;

public interface Payments {
    void doTransaction(BigDecimal amount);
}