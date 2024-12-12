package ru.volkov.lesson9.designpatterns.сreational.factory;

public class Ruble implements Currency {
    @Override
    public String getSymbol() {
        return "Rub";
    }
}
