package ru.volkov.lesson6.io.rw;

import java.io.*;

public class BufferedReaderRunner {

    public static void main(String[] args) {
        readFileWithBufferedReader();
        readConsole();
    }

    private static void readConsole() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/resources/TryWithRescTest.txt"))) {
            // чтение построчно
            String text;
            while (!(text = br.readLine()).equals("ESC")) {

                bw.write(text + "\n");
                bw.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    private static void readFileWithBufferedReader() {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/resources/TryWithRescTest.txt"))) {
            //чтение построчно
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
