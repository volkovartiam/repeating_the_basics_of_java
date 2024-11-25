package ru.volkov.lesson4.generics.base.multi;

import ru.volkov.lesson4.generics.base.Car;
import ru.volkov.lesson4.generics.base.Motorcycle;

public class Demo {
    public static void main(String[] args) {
        Car car = new Car("Aston Martin");
        Motorcycle motorcycle = new Motorcycle("Honda CBR500R");
        Truck truck = new Truck("Road Kill");

        TripleGarage<Car, Motorcycle, Truck> garage1 = new TripleGarage<>();
        garage1.setVehicle1(car);
        garage1.setVehicle2(motorcycle);
        garage1.setVehicle3(truck);

        TripleGarage<Car, Motorcycle, Truck> garage2 = new TripleGarage<>();
        garage2.setVehicle1(truck);
        garage2.setVehicle2(motorcycle);
        garage2.setVehicle3(truck);
        Car car1 = garage2.getVehicle1();
// Truck truck1 =  garage2.getVehicle1();

        TripleGarage<Car, Car, Car> garage3 = new TripleGarage<>();
        garage3.setVehicle1(car);
        garage3.setVehicle2(car);
        garage3.setVehicle3(car);
    }
}
