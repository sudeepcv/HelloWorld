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
            t1.setPriority(1);
            t2.setPriority(10);
            // priority values from 1 to 10
        t1.start();
        t2.start();

        try {

            System.out.println(t1.isAlive());
            t1.join();
            t2.join();

            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
            System.out.println(t1.isAlive());
               System.out.println("threads completed");

        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        
     

    }
}
