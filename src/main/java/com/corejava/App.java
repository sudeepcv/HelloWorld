package com.corejava;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {
    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) throws InterruptedException{
        System.out.println("Thread has been Started");
        Thread t1=new Thread(new Runnable(){
           
            public void run(){
                try{
                     this.producer();
                }catch(InterruptedException e){}
               

            }
        });


                Thread t2=new Thread(new Runnable(){
            
            public void run(){
                try{
                    consumer();
                }catch(InterruptedException e){}                

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();


    }

    private static void producer() throws InterruptedException {
        Random random = new Random();
        while (true) {
            queue.put(random.nextInt(100));

        }
    }

    private  static void consumer() throws InterruptedException {
        Random random =new Random();
        while(true){
            Thread.sleep(100);
            if(random.nextInt(10)==0){
                Integer value=queue.take();
                System.out.println("Taken value is:"+value+" and the size of the queue is :"+queue.size());
            }

        }

    }
}
