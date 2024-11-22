package ru.volkov.lesson3.homework;

public abstract class Animal {

    private String description;
    public String getDescription(){
        return this.description;
    }

    public Animal(String description){
        this.description = description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

//    public abstract static void info();
//    Illegal combination of modifiers: 'abstract' and 'static'
}
