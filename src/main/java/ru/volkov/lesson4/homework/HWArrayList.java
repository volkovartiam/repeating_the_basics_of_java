package ru.volkov.lesson4.homework;

import java.util.ArrayList;
import java.util.List;

public class HWArrayList {


    public static void main(String[] args) {

        boolean bool = false;
        String str = "";

        System.out.println("Создаем коллекции");
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        System.out.println(stringArrayList+ " " + " - Выводим ArrayList");

        stringArrayList.add(0, "100");
        System.out.println(stringArrayList+ " " + " - добавляем в начало");

        stringArrayList.add("50");
        System.out.println(stringArrayList+ " " + " - добавляем в конец");

        stringArrayList.add(2, "30");
        System.out.println(stringArrayList+ " " + " - добавляем в середину");


        bool = stringArrayList.remove("1");
        System.out.println(stringArrayList + " " + Boolean.toString(bool) + " " + " - удаляем объект");

        bool = stringArrayList.remove("123456789");
        System.out.println(stringArrayList + " " + Boolean.toString(bool) + " " + " - удаляем несуществующий объект");

        str = stringArrayList.remove(0);
        System.out.println(stringArrayList + " " + str + " " + " - удаленный по индексу объект");

        try {
            str = stringArrayList.remove(500);
        }catch (IndexOutOfBoundsException e) {
            System.out.print(e.getMessage() + " ");
            System.out.println(str + " " + " - удаление по несуществующему индексу");
        }

        bool = stringArrayList.remove("50");
        System.out.println(stringArrayList + " " + Boolean.toString(bool) + " " + " - удаленный по индексу объект");

        bool =  stringArrayList.removeAll( List.of("2", "3") );
        System.out.println(stringArrayList + " " + Boolean.toString(bool) + " " + " - удаление списком");

        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");

        bool =  stringArrayList.removeAll( List.of("0", "1") );
        System.out.println(stringArrayList + " " + Boolean.toString(bool) + " " + " - удаление списком (есть несовпадающие элементы)");

        stringArrayList.clear();
        System.out.println(stringArrayList + " - очистка списка");



    }

}
