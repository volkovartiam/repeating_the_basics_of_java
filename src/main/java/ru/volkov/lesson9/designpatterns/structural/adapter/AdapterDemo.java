package ru.volkov.lesson9.designpatterns.structural.adapter;

public class AdapterDemo {

    public static void main(String args[]) {

        Integer[][] squares = {{2, 4}, {3, 9}, {4, 16}};

        MapAdapter adapter = new MapAdapter(squares);
        System.out.println("adapter map contains : " + adapter);
        System.out.println("get element by key " + 2 + " result " + adapter.get(2));

    }

}
