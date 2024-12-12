package ru.volkov.lesson9.designpatterns.structural.proxy;

import java.util.Set;

public class SecurityAirportProxy implements Airport {

    private static final Set<Profession> PROFESSION_BLOCKING = Set.of(Profession.TERRORIST);

    private final Airport airport;

    public SecurityAirportProxy(Airport airport) {
        this.airport = airport;
    }

    @Override
    public void enter(Passenger passenger) {
        if (PROFESSION_BLOCKING.contains(passenger.getType())) {
            System.out.println(passenger + " is not allowed in airport");
        } else {
            airport.enter(passenger);
        }
    }
}
