package ru.volkov.lesson9.designpatterns.сreational.factory;

public class USDollar implements Currency {
    @Override
    public String getSymbol() {
        return "USD";
    }
}
