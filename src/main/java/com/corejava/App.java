package com.corejava;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("sudeep", 29), new Person("manu", 30), new Person("Tinu", 24));
        people.forEach(p -> System.out.println(p.toString()));
        Collections.sort(people);
        System.out.println("after sort:");

        people.forEach(p -> System.out.println(p.toString()));

    }

}
