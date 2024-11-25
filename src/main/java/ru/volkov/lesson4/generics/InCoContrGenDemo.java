package ru.volkov.lesson4.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InCoContrGenDemo {
    public static void main(String[] args) {
        Integer str1 = 22;
        Number obj = 2424;
        obj = str1;

        // Ковариантность массивов
        String[] strArray = new String[0];
        Object[] objArray = strArray;

        // Ковариантность List
        List<Integer> intList = new ArrayList<>();
        List<Double> dubList = new ArrayList<>();
        List<Object> objectList = new ArrayList<>(); //error
        List<? extends Number> numList = dubList;

        for (Number d : numList) {
            System.out.println(d.longValue());
        }

        // Контравариантность List
        List<Number> objList1 = new ArrayList<>();
        List<Object> objList2 = new ArrayList<>();
        List<Integer> objList3 = new ArrayList<>();//error
        List<? super Number> numList1 = objList1;

        // Инвариантность
//        List<String> strList = objList2;


//        PECS - Producer Extends Consumer Super

        List<Number> nums = Arrays.asList(4.1F, 0.2F);
        List<Integer> intListNew = Arrays.asList(1,2);
        Collections.copy(nums, intListNew);
    }
}
