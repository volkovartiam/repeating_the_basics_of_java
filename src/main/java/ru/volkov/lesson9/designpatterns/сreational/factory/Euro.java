package ru.volkov.lesson9.designpatterns.сreational.factory;

public class Euro implements Currency{
    @Override
    public String getSymbol() {
        return "EUR";
    }
}
