package ru.volkov.lesson2.immutable;

import java.util.ArrayList;
import java.util.List;

public final class Person {
    private final String name;
    private Integer age;
    private List<String> preferFilms = new ArrayList<>();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.preferFilms = List.copyOf(list);
    }

    public void addFilm(String film) {
        preferFilms.add(film);
    }

    public List<String> getPreferFilms() {
        return List.copyOf(preferFilms);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
    //error compile
//    public void setName(String name) {
//        this.name = name;
//    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", preferFilms=" + preferFilms +
                '}';
    }
}
