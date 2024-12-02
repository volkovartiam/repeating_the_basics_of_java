package ru.volkov.lesson6.io.iostream;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamRunner {

    public static void main(String[] args) {
        readAllBytes();
        readFiveChars();
    }

    private static void readAllBytes() {
        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while ((b = byteStream1.read()) != -1) {
            System.out.print((char) b);
        }
        System.out.println();
    }

    private static void readFiveChars() {
        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 7, 5);
        int c;
        while ((c = byteStream2.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
