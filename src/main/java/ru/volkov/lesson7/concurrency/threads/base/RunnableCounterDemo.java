package ru.volkov.lesson7.concurrency.threads.base;

import ru.volkov.lesson7.concurrency.threads.base.worker.RunnableCounterWorker;

public class RunnableCounterDemo {
    public static void main(String[] args) {
        RunnableCounterWorker scw1 = new RunnableCounterWorker("A", 15);
        RunnableCounterWorker scw2 = new RunnableCounterWorker("B", 15);


        // МНОГОПОТОЧНАЯ ОБРАБОТКА
        Thread t1 = new Thread(scw1); //NEW
        Thread t2 = new Thread(scw2);
        t1.run(); //Runnable
        t2.start();
    }
}
