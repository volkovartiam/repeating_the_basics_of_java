package ru.volkov.lesson6.io.rw;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileReaderRunner {
    public static void main(String[] args) {
        readFileByEachChar();
        System.out.println("---------------");
        readFileWithArray();

    }

    private static void readFileByEachChar() {
        try (FileReader reader = new FileReader("src/main/resources/TryWithRescTest.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readFileWithArray() {
        try (FileReader reader = new FileReader("src/main/resources/TryWithRescTest.txt")) {
            char[] buf = new char[256];
            int c;
            while ((c = reader.read(buf)) > 0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }


}
