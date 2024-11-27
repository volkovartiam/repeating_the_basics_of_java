package ru.volkov.lesson4.homework;

public class CustomArrayListDemo {

    public static void main(String[] args) {

        HWCustomArrayList<String> list = new HWCustomArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");

        System.out.println(list);
        System.out.println(list.get(0) );

        System.out.println(list.remove(0) );
        System.out.println(list);

        // java.lang.ArrayIndexOutOfBoundsException
        // System.out.println(list.get(33) );



    }

}
