package ru.volkov.lesson4.generics.list;

import ru.volkov.lesson4.generics.base.Car;
import ru.volkov.lesson4.generics.base.Motorcycle;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        DynamicSizedGarage<Motorcycle> garage = new DynamicSizedGarage<>();
        garage.add(new Motorcycle("Honda CBR500R"));
        garage.add(new Motorcycle("Harley-Davidson"));
        Motorcycle motorcycle1 = garage.get(0);
        Motorcycle motorcycle2 = garage.get(1);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota"));
        cars.add(new Car("Jaguar"));
        cars.add(new Car("BMW"));

        DynamicSizedGarage<Car> garageCars = new DynamicSizedGarage<>();
        garageCars.add(new Car("Aston Martin"));
        garageCars.addAll(cars);
    }
}
