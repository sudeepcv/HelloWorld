package com.corejava;

public class App {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println("Hi");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(()-> {

                try {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Hello Thread");
                        Thread.sleep(1000);

                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        t1.start();
        t2.start();


    }
}
