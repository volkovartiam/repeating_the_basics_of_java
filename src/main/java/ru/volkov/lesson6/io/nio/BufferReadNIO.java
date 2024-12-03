package ru.volkov.lesson6.io.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BufferReadNIO {

    public static final String filePath = "src/main/resources/TryWithNIO.txt";

    public static void main(String[] args) {

        RandomAccessFile aFile = null;
        // read only example
        try {
            aFile = new RandomAccessFile(filePath, "r");
            System.out.println(aFile.length()  + " - размер файла." );
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            aFile.writeChars("zzz");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            String fd = aFile.getFD().toString();
            System.out.println(fd);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
