package com.corejava;

import java.util.Scanner;

public class Processor{

    public void producer() throws InterruptedException{

        synchronized(this){
        System.out.println("Producer started...");
        wait();
        System.out.println("Producer Ended...");

        }


    }
    public void consumer() throws InterruptedException{
        Scanner scanner=new Scanner(System.in);
        Thread.sleep(2000);
         synchronized(this){
             System.out.println("Consumer has been started...");
             scanner.nextLine();
               System.out.println("consumer ended...");
             notify();
           

         }

    }

}