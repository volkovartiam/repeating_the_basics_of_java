package ru.volkov.lesson9.designpatterns.сreational.factory;

public class CurrencyFactory {
    public static Currency createCurrency(String country) {
        if (country.equalsIgnoreCase("Russia")) {
            return new Ruble();
        } else if (country.equalsIgnoreCase("EU")) {
            return new Euro();
        } else if (country.equalsIgnoreCase("US")) {
            return new USDollar();
        } if (country.equalsIgnoreCase("Panama")) {
            return new USDollar();
        }
        throw new IllegalArgumentException("No such currency");
    }
}
