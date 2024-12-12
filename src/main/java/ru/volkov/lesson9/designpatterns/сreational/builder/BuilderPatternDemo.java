package ru.volkov.lesson9.designpatterns.сreational.builder;

public class BuilderPatternDemo {

    public static void main(String args[]) {

        Cake cake = new Cake(1, 0.5, 2, 0, 0, 0, 0, 0);
//
        //Создание объекта с помощью шаблона «Строитель»
        Cake whiteCake = new Cake.Builder()
                .sugar(1)
                .butter(0.5)
                //.eggs(2)
                .build();

        //Торт готов :)
        System.out.println(whiteCake);
    }
}