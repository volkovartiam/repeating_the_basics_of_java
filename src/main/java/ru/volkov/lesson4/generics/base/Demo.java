package ru.volkov.lesson4.generics.base;

public class Demo {
    public static void main(String[] args) {
//         Error flow
//        Garage garage = new Garage();
//        garage.set(new Car("Aston Martin"));
//        Car car = (Car) garage.get();
//        System.out.println(car.getName()); // Aston Martin
//
//        Garage garage2 = new Garage();
//        garage2.set(new Motorcycle("Honda CBR500R"));
//        Motorcycle motorcycle = (Motorcycle) garage.get();
//        System.out.println(motorcycle.getName());

// correct
        GarageNew<Car> carGarageNew = new GarageNew<>();
        carGarageNew.set(new Car("Aston Martin"));
        Car carNew = carGarageNew.get();
        System.out.println(carNew.getName()); // Aston Martin

        GarageNew<Motorcycle> motorcycleGarageNew = new GarageNew<>();
        motorcycleGarageNew.set(new Motorcycle("Honda CBR500R"));
        Motorcycle motorcycleNew = motorcycleGarageNew.get();
        System.out.println(motorcycleNew.getName());

         //motorcycleGarageNew.set(new Car("Honda CBR500R"));

    }
}
