package ru.volkov.lesson9.designpatterns.behavioral.strategy;

import java.util.Arrays;

public class InsertionSort implements Strategy {
    @Override
    public void sort(int[] sortArr) {
        System.out.println("sorting array using insertion sort strategy");
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }

    }
}
