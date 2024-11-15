package ru.volkov;

public abstract  class ClassExample {
// java: cannot inherit from final ru.volkov.ClassExample
// если задать модификатор final

    String text = "";

    ClassExample(){
        this.text= "Hello World";
    }

    static class Inner{

        Inner(){
            System.out.println("Inner static created");
        }
    }

    public void print(){
        System.out.println("Print method");
    }
}
