package ru.volkov.lesson6.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        String filePath = "src/main/resources/TryWithRescTest.txt";
        File file = new File(filePath);
        System.out.println(file.createNewFile() +  " - создание файла при его отсутвии?");
        System.out.println(file.exists() + " - файл существует?");
        System.out.println(file.setExecutable(true) + " - файл исполняемый?");

        System.out.println(file.isFile() + " - это файл?");
        System.out.println(file.isDirectory() + " - это папка?");
        System.out.println(file.getName() + " - имя файла");
        System.out.println(file.getParent()+ " - имя папки где лежит файл");
        System.out.println(file.getAbsolutePath() + " - абсолютный путь");

        File dir = new File("src/test/resources/test/text");
        System.out.println(dir.mkdirs());

//        BufferedInputStream str = new BufferedInputStream(new FileInputStream(new File("str")));
    }
}
