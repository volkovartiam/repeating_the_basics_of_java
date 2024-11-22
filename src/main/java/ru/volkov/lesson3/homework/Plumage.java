package ru.volkov.lesson3.homework;

import java.util.Objects;

public class Plumage {

    String color = "";

    public Plumage(String color){
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plumage plumage)) return false;
        return color.equals(plumage.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
