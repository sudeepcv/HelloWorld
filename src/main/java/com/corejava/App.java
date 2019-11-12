package com.corejava;

class Counter{
    int count;

    public  synchronized void add(){
        count++;
    }
}

public class App {
    public static void main(String[] args) throws Exception {

       Counter counter=new Counter();

        Runnable runnable = () -> {
            for (int i = 0; i <1000; i++) {
       
                    System.out.println("Hi");
                    counter.add();
                    
 
            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(()-> {

              
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Hello Thread");
                        counter.add();
                        

                    }

        
            });


        t1.start();
        t2.start();

        try {

            System.out.println(t1.isAlive());
            t1.join();
            t2.join();

            System.out.println("Counter->"+counter.count);

            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
            System.out.println(t1.isAlive());
               System.out.println("threads completed");

        } catch (InterruptedException e) {            
            e.printStackTrace();
        }
        
     

    }
}
