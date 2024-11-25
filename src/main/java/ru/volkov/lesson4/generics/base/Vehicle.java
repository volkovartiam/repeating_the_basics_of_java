package ru.volkov.lesson4.generics.base;

public abstract class Vehicle {

    protected final String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

