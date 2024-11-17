package ru.volkov.lesson2.enums;


public class Demo {
    private static final String RUN = "run";

    public static void main(String[] args) {

        var start = StatesExtended.START;
        System.out.println(start.getDetail());
        StatesExtended running = StatesExtended.RUNNING;
        System.out.println(running.getDetail());
        System.out.println(start);
        start.close();


        var start_simple = StatesSimple.START;
        System.out.println(start_simple);
    }
}
