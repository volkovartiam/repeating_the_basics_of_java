package ru.volkov.lesson6.serialization;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {

    public static void main(String[] args) /*throws IOException, ClassNotFoundException*/ {
        Path path = Path.of("src/main/resources", "person.out");

        try {
            writeObject(path);
            readObject(path);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Person object = (Person) objectInputStream.readObject();
            System.out.println(object);
            System.out.println(object.hashCode());
        }
    }

    private static void writeObject(Path path) throws IOException, ClassNotFoundException {
        Person sergey = new Person(36, "Sergey", "Petrov");
        System.out.println(sergey);
        System.out.println(sergey.hashCode());
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            objectOutputStream.writeObject(sergey);
        }
    }

}
