package ru.volkov.lesson3.opp.link;

public class Animal extends Object {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public void makeSound(Integer repetitions) {
        while(repetitions != 0) {
            System.out.println("Animal makes a sound countdown " + repetitions);
            repetitions -= 1;
        }
    }
}
