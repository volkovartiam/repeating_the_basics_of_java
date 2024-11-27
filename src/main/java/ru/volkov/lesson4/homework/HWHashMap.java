package ru.volkov.lesson4.homework;

import java.util.*;

public class HWHashMap {

    public static void main(String[] args) {

        boolean bool = false;
        String str = "";
        Double d = 0.0;

        System.out.println("Создаем коллекции");
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        hashMap.put("1", 1.0);
        hashMap.put("2", 2.0);
        hashMap.put("3", 3.0);
        System.out.println(hashMap + " " + " - Выводим HashMap");

        System.out.println(hashMap.values() + " - вывод всех значений");
        System.out.println(hashMap.get("1") + " - получить объект");
        System.out.println(hashMap + " - Выводим HashMap (при получении объекта он сохраняется в коллекции)");
        System.out.println(hashMap.get("100") + " - получить несуществующий объект");

        d = hashMap.remove("1");
        System.out.println(hashMap + " " + d + " - удаляем объект из коллекции");

        d = hashMap.remove("100");
        System.out.println(hashMap + " " + d + " - удаляем несуществующий объект из коллекции");

        bool = hashMap.remove("2", 2.2);
        System.out.println(hashMap + " " + bool + " - удаляем объект с неверным значением");

        bool = hashMap.remove("2", 2.0);
        System.out.println(hashMap + " " + bool + " - удаляем объект с неверным значением");

        hashMap.put("1", 1.0);
        hashMap.put("2", 2.0);
        hashMap.put("3", 3.0);
        System.out.println(hashMap);

        HashMap<String, Double> hashMap2 = new HashMap<String, Double>();
        hashMap2.put("10", 10.0);
        hashMap2.put("20", 20.0);
        hashMap2.put("30", 30.0);
        hashMap2.put("30", 20.0);

        hashMap.putAll(hashMap2);
        System.out.println(hashMap);
        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.values() + " - значения коллекции");
        System.out.println(hashMap.values() + " - значения коллекции");

        System.out.println(hashMap.keySet() + " - значения ключей");



        for (String key : hashMap.keySet() ) {
            // java.util.ConcurrentModificationException
//            if(hashMap.containsKey(key) ) {
//                hashMap.remove(key);
//            }
            System.out.print(key + " ");
        }



        Iterator<Map.Entry<String, Double>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Double> entry = iterator.next();
            iterator.remove();
        }
        System.out.println(hashMap);

    }

}
