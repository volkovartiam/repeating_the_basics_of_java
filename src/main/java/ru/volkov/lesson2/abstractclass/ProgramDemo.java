package ru.volkov.lesson2.abstractclass;

import java.lang.reflect.Method;

public class ProgramDemo {

    public static void main(String[] args) throws ClassNotFoundException {

        Employer sam = new Employer("Sam", "Leman Brothers");
        sam.display();
        Student bob = new Student("Bob", "UFO");
        bob.display();

        Person personSam = new Employer("Sam", "Leman Brothers");
        personSam.display();
        Person personBob = new Student("Bob", "MGU");
        personBob.display();

        Student student = new Student("Bob", "MGU");

        // student.universityName = "MMMGGGUUU";   Cannot assign a value to final variable 'universityName'
        //System.out.println(student.universityName);
        System.out.println(student);

    }
}


