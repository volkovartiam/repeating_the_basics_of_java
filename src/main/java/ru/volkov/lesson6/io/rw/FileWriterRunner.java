package ru.volkov.lesson6.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterRunner {

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("src/main/resources/TryWithRescTest.txt", true)) {
            writer.append("Hello World!");
            writer.append('\n');
            writer.append("Java");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
