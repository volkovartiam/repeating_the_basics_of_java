package ru.volkov.lesson3.opp.link;

public class NewStaticLinkDemo {

    public static void main(String[] args) {

        System.out.println("New activity class");
        Animal animal = new Animal();
        animal.makeSound();
        animal.makeSound(3);

        Activity activity = new Activity();
        activity.eat(animal);

        Animal dogAnimal = new Dog();
        activity.eat(dogAnimal);


        Dog dogAnimal1 = (Dog) dogAnimal;
        activity.eat(dogAnimal1);

        Dog dog = new Dog();
        activity.eat(dog);
    }
}
