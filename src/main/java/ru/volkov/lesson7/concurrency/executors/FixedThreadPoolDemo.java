package ru.volkov.lesson7.concurrency.executors;

import ru.volkov.lesson7.concurrency.executors.task.GenerateRandomIntegerTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        long start = System.currentTimeMillis();
        try (ExecutorService executorService = Executors.newFixedThreadPool(100)) {
            for (int i = 0; i < 100; i++) {
                executorService.submit(new GenerateRandomIntegerTask());
            }
        } finally {
            long end = System.currentTimeMillis();
            long duration = end - start;
            System.out.println("Processed in: " + duration + " ms");
        }
    }

}
