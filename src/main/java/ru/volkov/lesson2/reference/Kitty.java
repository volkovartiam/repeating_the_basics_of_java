package ru.volkov.lesson2.reference;

public class Kitty extends Cat {

    public Kitty(String name) {
        super(name);
        this.name = name;
    }

    @Override
    String sing() {
        return "kiki";
    }
}
