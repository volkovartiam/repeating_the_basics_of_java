package ru.volkov.lesson6.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionRunner2 {
    public static void main(String[] args) {

        int[] number = {};

        try {
            System.out.println(number[2]);
        } catch(Exception c) {
            System.out.println(c);
        }


        try {
            dangerMethod();
        } catch(InterruptedException ex) {
            ex.getCause();
        } catch(Exception ex) {
            String str =  ex.getMessage();
            System.out.println(str);
        }

        System.out.println("After except");
    }

    static void dangerMethod() throws InterruptedException, FileNotFoundException {
        Thread.sleep(2000);
        FileInputStream res = new FileInputStream(new File("res"));
    }
}
