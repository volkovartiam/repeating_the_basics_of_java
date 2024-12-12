package ru.volkov.lesson9.designpatterns.structural.proxy;

public class SpbPulkovoAirport implements Airport {

    public SpbPulkovoAirport() {
    }

    @Override
    public void enter(Passenger passenger) {
        System.out.println(passenger + " enters the tower.");
    }
}
