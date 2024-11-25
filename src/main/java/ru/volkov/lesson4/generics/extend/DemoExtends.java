package ru.volkov.lesson4.generics.extend;

import ru.volkov.lesson4.generics.base.Car;
import ru.volkov.lesson4.generics.base.GarageNew;
import ru.volkov.lesson4.generics.base.Jupiter;
import ru.volkov.lesson4.generics.base.Motorcycle;

public class DemoExtends {
    public static void main(String[] args) {
        GarageNew<Jupiter> jupiterGarageNew = new GarageNew<>();
        jupiterGarageNew.set(new Jupiter());
        Jupiter jupiter = jupiterGarageNew.get();

//        GarageExtends<Jupiter> jupiterGarageExtends = new GarageExtends<>();
//        jupiterGarageNew.set(new Jupiter());
//        Jupiter jupiter = jupiterGarageNew.get();

        GarageExtends<Car> carGarageNew = new GarageExtends<>();
        carGarageNew.set(new Car("Aston Martin"));
        Car carNew = carGarageNew.get();
        System.out.println(carNew.getName()); // Aston Martin

        GarageExtends<Motorcycle> motorcycleGarageNew = new GarageExtends<>();
        motorcycleGarageNew.set(new Motorcycle("Honda CBR500R"));
        Motorcycle motorcycleNew = motorcycleGarageNew.get();
        System.out.println(motorcycleNew.getName());
    }
}
