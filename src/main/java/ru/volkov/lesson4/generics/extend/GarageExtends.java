package ru.volkov.lesson4.generics.extend;

import ru.volkov.lesson4.generics.base.Vehicle;

public class GarageExtends<T extends Vehicle> {

    private T vehicle;

    public T get() {
        return vehicle;
    }

    public void set(T vehicle) {
        this.vehicle = vehicle;
    }
}
