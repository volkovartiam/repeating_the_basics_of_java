package ru.volkov.lesson2.research;

public class Main {

    public static void main(String[] args) {

//        AbstractExample ace = new AbstractExample();

        SubClassExample sce = new SubClassExample();
        sce.doSomething();
        sce.paint();
        sce.print();

        System.out.println("In research package");
        System.out.println(AbstractExample.size);

        Person person = new Person();
        person.print();
        person.makeMistake();

        String noise = Animal.DOG.makeNoise();
        System.out.println(noise);
    }
}
