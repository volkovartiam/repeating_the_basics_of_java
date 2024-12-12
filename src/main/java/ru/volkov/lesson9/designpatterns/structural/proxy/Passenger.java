package ru.volkov.lesson9.designpatterns.structural.proxy;

public class Passenger {

    private String name;
    private Profession type;

    public Passenger(String name, Profession type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public Profession getType() {
        return type;
    }
}
