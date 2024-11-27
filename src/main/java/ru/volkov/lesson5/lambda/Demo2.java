package ru.volkov.lesson5.lambda;

public class Demo2 {
    public static void main(String[] args) {

        Printable printer = s -> System.out.println(s);
        printer.print("Hello World from Java !");
    }
}
