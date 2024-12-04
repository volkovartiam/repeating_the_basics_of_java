package ru.volkov.lesson7.concurrency.forkjoin;

import ru.volkov.lesson7.concurrency.forkjoin.model.DivideNumberAction;

import java.util.concurrent.ForkJoinPool;

public class DivideNumberDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (ForkJoinPool forkJoinPool = new ForkJoinPool()) {
            DivideNumberAction divideNumberAction = new DivideNumberAction(1_000);
            forkJoinPool.invoke(divideNumberAction);
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("Time elapsed: " + duration + " ms");
        }
    }
}
