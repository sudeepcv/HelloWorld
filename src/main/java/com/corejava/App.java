package com.corejava;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        FunctinalInterface fi=(s) -> {System.out.println(s);};
        fi.print("Hello world Lamda !!");
    }
}
interface FunctinalInterface{
    public void print(String s);
}