package ru.volkov.lesson2.clazz;


import ru.volkov.lesson2.abstractclass.Employer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

    public static void main(String[] args) throws ClassNotFoundException {
        Employer employer = new Employer("Fill", "Aston");
        Class<? extends Employer> aClass = employer.getClass();
        Class<?> employerClass = Class.forName("ru.volkov.lesson2.abstractclass.Employer");
        Field[] fields = employerClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        Method[] methods = employerClass.getMethods();

    }
}