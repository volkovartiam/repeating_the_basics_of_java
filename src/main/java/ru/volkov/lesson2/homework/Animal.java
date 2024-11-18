package ru.volkov.lesson2.homework;

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

}
