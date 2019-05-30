package com.corejava;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Java8Class java8Class = new Java8Class();
        java8Class.print();

    }
}

interface Java8Interface {
    default void print() {
        System.out.println("test");
    }
}

class Java8Class implements Java8Interface {

}
