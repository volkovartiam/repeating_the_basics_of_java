package ru.volkov.lesson9.designpatterns.сreational.factory;

public class FactoryDemo {
    public static void main(String args[]) {
        //String country = args[0];
        String country = "RUSSIA";

        Currency currency = CurrencyFactory.createCurrency(country);
        System.out.println(currency.getSymbol());
    }
}
