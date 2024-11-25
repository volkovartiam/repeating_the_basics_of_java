package ru.volkov.lesson4.generics.base.multi;

import ru.volkov.lesson4.generics.base.Car;
import ru.volkov.lesson4.generics.base.Vehicle;

public class TripleGarage<T extends Vehicle, U extends Vehicle, V extends Vehicle> {

    private T vehicle1;
    private U vehicle2;
    private V vehicle3;

    public TripleGarage() {
    }

    public void setVehicle1(T vehicle1) {
        this.vehicle1 = vehicle1;
    }

    public void setVehicle2(U vehicle2) {
        this.vehicle2 = vehicle2;
    }

    public void setVehicle3(V vehicle3) {
        this.vehicle3 = vehicle3;
    }

    public T getVehicle1() {
        return vehicle1;
    }

    public U getVehicle2() {
        return vehicle2;
    }

    public V getVehicle3() {
        return vehicle3;
    }
}
