package ru.volkov.lesson4.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HWCustomArrayList<T extends  Object> {

    private int index = 0;
    private int capacity = 2;

    private T[] array = (T[]) new Object[capacity];


    public void add(T t){
        if(index == capacity) {
            largeArray();
        }
        this.array[index] = t;
        index++;
    }

    public T get(int index){
        return array[index];
    }

    public T remove(int index){
        T t = array[index];
        array[index] = null;
        return t;
    }


    private void largeArray(){
        this.capacity = this.capacity + 10;
        T[] newArray = (T[]) new Object[capacity];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        this.array = newArray;
    }

    @Override
    public String toString() {
        String s = "";
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                s += array[i] + " ";
            }
        }
        return s;
//        return "HWCustomArrayList{" +
//                "array=" + Arrays.toString(array) +
//                '}';

    }
}
