package com.corejava;

class PrintHi implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {            
            try {
                System.out.println("Hi");
                Thread.sleep(1000);
            } catch (InterruptedException e) {               
                e.printStackTrace();
            }
        }

    }
}

class Print implements Runnable {

    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Thread");
                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

public class App {
    public static void main(String[] args) {
        Print print = new Print();
        PrintHi printHi=new PrintHi();

        Thread thread1 = new Thread(print);
        Thread thread2 = new Thread(printHi);
        thread1.start();
        thread2.start();

    }
}
