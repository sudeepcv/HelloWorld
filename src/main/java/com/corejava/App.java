package com.corejava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(new Person("sudeep", 29), new Person("manu", 30), new Person("Tinu", 24));

        // people.stream().forEach(p -> {
        // System.out.println(p.getName());
        // });

        people.stream().filter(p -> {
            return p.getName().contains("s");
        }).forEach(p -> {
            System.out.println(p.getName());
        });

        people.parallelStream().filter(p -> {
            return p.getName().contains("s");
        }).forEach(p -> {
            System.out.println(p.getName());
        });

    }

}
