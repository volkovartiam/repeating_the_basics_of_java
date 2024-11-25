package ru.volkov.lesson4.generics.list;

import ru.volkov.lesson4.generics.base.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class DynamicSizedGarage<T extends Vehicle> {

    private final List<T> vehicles;

    public DynamicSizedGarage() {
        vehicles = new ArrayList<>();
    }

    public void add(T t) {
        vehicles.add(t);
    }

    public T get(int index) {
        return vehicles.get(index);
    }

    public void addAll(List<T> list) {
        vehicles.addAll(list);
    }
}
