package com.corejava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        Thread thread=new Thread(new Runnable(){
        
            @Override
            public void run() {
                System.out.println("Hello runnable");
            }
        });
        thread.run();


        Thread lambdaThread=new Thread(() -> {System.out.println("Hello runnable Lambda!!");});
        lambdaThread.run();
    }
}
