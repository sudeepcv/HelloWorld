package com.corejava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //LambdaMethodReferences   classname :: methodname
        Thread thread=new Thread(App::print);
        thread.start();
    }

    public static void print(){
        System.out.println("Lambda method references");

    }
}
