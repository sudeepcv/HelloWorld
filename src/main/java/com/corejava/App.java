package com.corejava;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> resutl = executor.submit(() -> {
            try {
                System.out.println("starts..");
                Thread.sleep(2000);
                System.out.println("ends....");
                return "execution completed";
            } catch (InterruptedException e) {
                e.printStackTrace();
                return null;
            }
        });

        executor.shutdown();
        System.out.println("the result is:->" + resutl.get());

    }
}