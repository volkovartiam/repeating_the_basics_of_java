package ru.volkov.lesson6.io.iostream;

import java.io.*;

public class DataIoStreamRunner {
    public static void main(String[] args) {

        Person tom = new Person("Tom", 34, 1.68, false);
        // запись в файл
        writeDataToFile(tom);

        // обратное считывание из файла
        readDataFromFile();
    }

    private static void writeDataToFile(Person tom) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/main/resources/DataIoStreamRunner.bin"))) {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void readDataFromFile() {
        try (DataInputStream dos = new DataInputStream(new FileInputStream("src/main/resources/DataIoStreamRunner.bin"))) {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m) {
        this.name = n;
        this.height = h;
        this.age = a;
        this.married = m;
    }
}
