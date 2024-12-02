package ru.volkov.lesson6.io.rw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterRunner {

    public static void main(String[] args) {
        writeFileWithBufferedReader();
    }

    private static void writeFileWithBufferedReader() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/TryWithRescTest.txt"))) {
            String text = "Hello  World!\nHey! Teachers! Leave the kids alone.";
            bw.write(text);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
