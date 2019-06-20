package com.corejava;

/**
 * Hello world!
 *
 */
public class App
{
     public static void main(String[] args)
    {
        App obj = new App();
        System.out.println(obj.hashCode());
        obj = null;
        // calling garbage collector
        System.gc();
        System.out.println("end of garbage collection");

    }
    @Override
    protected void finalize()
    {
        System.out.println("finalize method called");
    }
}
