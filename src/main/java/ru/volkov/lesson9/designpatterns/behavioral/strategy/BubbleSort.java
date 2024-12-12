package ru.volkov.lesson9.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class BubbleSort implements Strategy {
    @Override
    public void sort(int[] sortArr) {
        System.out.println("sorting array using bubble sort strategy");
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }
    }
}
