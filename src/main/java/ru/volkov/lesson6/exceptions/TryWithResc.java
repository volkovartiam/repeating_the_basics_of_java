package ru.volkov.lesson6.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResc {
    public static void main(String[] args)  {

        String filePath = "src/main/resources/TryWithRescText.txt";
        String firstLine = "";

        try {
            firstLine = TryWithResc.readFirstLineFromFileWithFinallyBlock(filePath);
            System.out.println("1 " + firstLine + "  readFirstLineFromFileWithFinallyBlock");
        } catch (IOException e ) {
            e.printStackTrace();
        }

        firstLine = TryWithResc.readFirstLineFromFile(filePath);
        System.out.println("2 " + firstLine + "  readFirstLineFromFile");

        try {
            firstLine = TryWithResc.readFirstLineFromFile2(filePath);
            System.out.println("3 " + firstLine + "  readFirstLineFromFile2");
        } catch (IOException e ) {
            e.printStackTrace();
        }

    }

    public static String readFirstLineFromFileWithFinallyBlock(String path) throws IOException {

        try ( BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }

    public static String readFirstLineFromFile(String path)  {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            return br.readLine();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readFirstLineFromFile2(String path) throws IOException {
        try (FileReader f = new FileReader(path); BufferedReader br = new BufferedReader(f)) {
            return br.readLine();
        }
    }
}
