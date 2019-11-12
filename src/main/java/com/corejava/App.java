package com.corejava;

class Print extends Thread {

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
        print.start();
    }
}
