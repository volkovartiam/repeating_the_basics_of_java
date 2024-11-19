package ru.volkov.lesson2.research;

public class Person implements Printable{


    public void print() {
        System.out.println("person print something");
    }

    @Override
    public void makeMistake() {
        System.out.println("do somes mistakes");
    }
}
