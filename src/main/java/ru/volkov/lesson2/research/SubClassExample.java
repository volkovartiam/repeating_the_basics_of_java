package ru.volkov.lesson2.research;

public class SubClassExample extends ExtendetAbstractExample{


    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void print() {
        System.out.println("print");
    }

    @Override
    public void paint() {
        System.out.println("paint");
    }
}
