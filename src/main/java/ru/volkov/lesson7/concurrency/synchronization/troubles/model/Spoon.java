package ru.volkov.lesson7.concurrency.synchronization.troubles.model;

public class Spoon {
    private Eater owner;

    public Spoon(Eater d) {
        owner = d;
    }

    public Eater getOwner() {
        return owner;
    }

    public synchronized void setOwner(Eater d) {
        owner = d;
    }

    public synchronized void use() {
        System.out.printf("%s has eaten!", owner.getName());
    }
}
