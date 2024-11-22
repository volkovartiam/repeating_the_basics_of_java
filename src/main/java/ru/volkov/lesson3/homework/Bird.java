package ru.volkov.lesson3.homework;

import java.util.Objects;

public class Bird extends Animal implements Flyable, Singable {

    String type;
    private Plumage plumage;

    private final boolean isFly;
    private boolean isSing = false;


    public Bird(String type, boolean isFly) {
        super("Животные");
        this.type = type;
        this.isFly = isFly;
        this.plumage = new Plumage("");
    }

    public void setSing(boolean isSing) {
        this.isSing = isSing;
    }

    public void setPlumage(Plumage plumage) {
        this.plumage = plumage;
    }


    @Override
    public String toString() {
        String flyDescription = "";
        if (isFly) {
            flyDescription = "летает";
        } else {
            flyDescription = "ходит";
        }

        String singDescription = "";
        if (isSing) {
            singDescription = "поет";
        }

        return this.getDescription() + " " + "Птица {" +
                type + " " +
                this.plumage.getColor() + " " +
                flyDescription + " " +
                singDescription + "" +
                '}';
    }

    @Override
    public boolean isFly() {
        return this.isFly;
    }

    @Override
    public boolean isSing() {
        return this.isSing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird bird)) return false;
        boolean compIsFly = (isFly == bird.isFly);
        boolean compIsSing = (isSing == bird.isSing);
        boolean compType = type.equals(bird.type);

        // если не переопределить класс Plumage, то может быть false
        boolean compPlumage = plumage.equals(bird.plumage);
        return compIsFly && compIsSing && compType && compPlumage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isFly, isSing, type, plumage);
    }
}