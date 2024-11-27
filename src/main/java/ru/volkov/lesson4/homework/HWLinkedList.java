package ru.volkov.lesson4.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HWLinkedList {


    public static void main(String[] args) {

        boolean bool = false;
        String str = "";

        System.out.println("Создаем коллекции");
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        System.out.println(stringList+ " " + " - Выводим LinkedList");

        stringList.add(0, "100");
        System.out.println(stringList+ " " + " - добавляем в начало");

        stringList.add("50");
        System.out.println(stringList+ " " + " - добавляем в конец");

        stringList.add(2, "30");
        System.out.println(stringList+ " " + " - добавляем в середину");


        bool = stringList.remove("1");
        System.out.println(stringList + " " + Boolean.toString(bool) + " " + " - удаляем объект");

        bool = stringList.remove("123456789");
        System.out.println(stringList + " " + Boolean.toString(bool) + " " + " - удаляем несуществующий объект");

        str = stringList.remove(0);
        System.out.println(stringList + " " + str + " " + " - удаленный по индексу объект");

        try {
            str = stringList.remove(500);
        }catch (IndexOutOfBoundsException e) {
            System.out.print(e.getMessage() + " ");
            System.out.println(str + " " + " - удаление по несуществующему индексу");
        }

        bool = stringList.remove("50");
        System.out.println(stringList + " " + Boolean.toString(bool) + " " + " - удаленный по индексу объект");

        bool =  stringList.removeAll( List.of("2", "3") );
        System.out.println(stringList + " " + Boolean.toString(bool) + " " + " - удаление списком");

        stringList.add("1");
        stringList.add("2");
        stringList.add("3");

        bool =  stringList.removeAll( List.of("0", "1") );
        System.out.println(stringList + " " + Boolean.toString(bool) + " " + " - удаление списком (есть несовпадающие элементы)");

        stringList.clear();
        System.out.println(stringList + " - очистка списка");

    }

}
