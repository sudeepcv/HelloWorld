package com.corejava;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) throws InterruptedException {
        final Processor processor = new Processor();
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    processor.producer();
                } catch (InterruptedException e) {
                }

            }
        });

        Thread t2 = new Thread(() -> {
            try {
                processor.consumer();
            } catch (InterruptedException e) {
            }

        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}