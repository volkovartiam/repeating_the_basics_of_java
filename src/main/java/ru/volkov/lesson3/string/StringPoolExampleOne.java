package ru.volkov.lesson3.string;

public class StringPoolExampleOne {

    public static void main(String[] args) {
        String str1 = "TopJava";
        String str2 = "TopJava";
        System.out.println("Строка 1 равна строке 2? " + (str1 == str2));
    }
}