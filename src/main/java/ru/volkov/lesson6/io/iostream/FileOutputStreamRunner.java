package ru.volkov.lesson6.io.iostream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamRunner {

    public static final String PATH = "src/main/resources/FileInputStreamRunnerText.txt";

    public static void main(String[] args) throws IOException {
        System.out.println();
        try (FileOutputStream outputStream = new FileOutputStream(PATH, true)) {
            String value = "Hello World!";
            outputStream.write(value.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
