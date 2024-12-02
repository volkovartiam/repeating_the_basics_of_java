package ru.volkov.lesson6.io.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TryWithRes {
    public static void main(String[] args) throws IOException {
        try (BufferedReader resources = Files.newBufferedReader(Paths.get("src/main/resources", "TryWithRescTest.txt"))) {
            System.out.println(resources.readLine());
        }
    }
}
