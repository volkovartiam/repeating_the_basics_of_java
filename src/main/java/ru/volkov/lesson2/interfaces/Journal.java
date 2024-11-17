package ru.volkov.lesson2.interfaces;

class Journal implements Printable {

    private String name;

    String getName() {
        return name;
    }

    Journal(String name) {

        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }
}