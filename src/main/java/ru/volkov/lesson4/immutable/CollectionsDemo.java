package ru.volkov.lesson4.immutable;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> string1 = List.of("String", "String2", "Strint3");

        List<String> list2 = Arrays.asList("String", "String2");

        List<String> someList3 = new LinkedList<>(string1);

        someList3.get(0);

        int[] numbers = {2, 34, 434};

        List<String> list = new ArrayList<>();
        list.add("Vasya");
        list.add("Petya");
        List<String> unmodifiableList = Collections.unmodifiableList(list);

        List<String> unmodifiableListJava9 = List.of("Vasya", "Petya");
    }

}
