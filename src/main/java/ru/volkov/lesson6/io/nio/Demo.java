package ru.volkov.lesson6.io.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/main/resources/" ,"TryWithRescTest.txt");
        Files.lines(path)
                .forEach(System.out::println);
        System.out.println("----------------");
        List<String> strings = Files.readAllLines(path);
        System.out.println(strings);
    }
}
