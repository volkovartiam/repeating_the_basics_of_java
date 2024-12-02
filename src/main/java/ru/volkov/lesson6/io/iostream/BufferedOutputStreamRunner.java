package ru.volkov.lesson6.io.iostream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamRunner {
    public static void main(String[] args) {

        String text = "Hello, hello Java world!"; // строка для записи
        try (FileOutputStream out = new FileOutputStream("src/main/resources/BufferedOutputStreamRunnerText.txt");
             BufferedOutputStream bos = new BufferedOutputStream(out)) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
