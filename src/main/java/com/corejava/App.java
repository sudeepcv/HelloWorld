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

        System.out.println("for loop:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName());
        }
        System.out.println("enhanced for loop:");
        for (Person p : people) {
            System.out.println(p.getName());
        }
        System.out.println("forEach:");
        people.forEach((p) -> {
            System.out.println(p.getName());
        });
    }

}
