package ru.volkov.lesson4.generics.base;

public class GarageNew<T> {

    private T vehicle;

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }
}
