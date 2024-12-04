package ru.volkov.lesson7.concurrency.synchronization.exchanger.model;

import java.util.concurrent.Exchanger;
import java.util.concurrent.atomic.AtomicInteger;

public class PongWorker implements Runnable {
    private final AtomicInteger counter;
    private final Exchanger<AtomicInteger> exchanger;
    private int limit = 0;

    public PongWorker(AtomicInteger counter, Exchanger<AtomicInteger> exchanger) {
        this.counter = counter;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        while (limit++ < 100) {
            try {
                AtomicInteger exchangedCounter = exchanger.exchange(counter);
                System.out.println("PONG: " + exchangedCounter.getAndIncrement());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
