package ru.volkov.lesson9.designpatterns.structural.proxy;

public class ProxyDemo {

    public static void main(String[] args) {
        Airport airport = getAirport();
        airport.enter(new Passenger("Ivan", Profession.DOCTOR));
        airport.enter(new Passenger("Guf", Profession.ITDEVELOPER));
        airport.enter(new Passenger("Carlos", Profession.TERRORIST));
    }

    private static SecurityAirportProxy getAirport() {
        return new SecurityAirportProxy(new SpbPulkovoAirport());
    }
}
