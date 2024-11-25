package ru.volkov.lesson4.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {
//        List list = new ArrayList();
//        list.add("1");
//        list.add("2");
//        list.add(3);

        Collection<Number> list = new ArrayList<>();
        list.add(1L);
        list.add(2);
        list.add(3);
////
//        String v1 = list.get(0);
//        String v2 = list.get(1);
//        String v3 = list.get(2);
    }

}
