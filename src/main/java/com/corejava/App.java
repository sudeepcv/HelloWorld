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

        System.out.println("before sort:");

        PrintAllPeople(people);

        // java 7 sort

        // Collections.sort(people, new Comparator<Person>() {
        //     @Override
        //     public int compare(Person o1, Person o2) {
        //         return o1.getName().compareTo(o2.getName());
        //     }
        // });

        System.out.println("after sort:");

        // PrintAllPeople(people);

        // java 8 lambda sort

        Collections.sort(people,(Person o1,Person o2)->{ return o1.getName().compareTo(o2.getName());});
        PrintAllPeople(people);

    }

    private static void PrintAllPeople(List<Person> people) {
        for (Person p : people) {
            System.out.println(p.getName());
        }
    }
}
