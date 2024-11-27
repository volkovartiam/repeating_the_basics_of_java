package ru.volkov.lesson5.optional;

public class Car  {
    String model;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               '}';
    }
}
