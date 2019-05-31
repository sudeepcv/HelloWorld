package com.corejava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // List<Person> people = Arrays.asList(new Person("sudeep", 29), new
        // Person("manu", 30), new Person("Tinu", 24));
        // people.forEach(p -> System.out.println(p.toString()));
        // Collections.sort(people);
        // System.out.println("after sort:");

        // people.forEach(p -> System.out.println(p.toString()));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        set.add(5);
        set.add(4);

        System.out.println("Hashset un ordered and un sorted duplicate not allowed");

        for (Integer i : set) {
            System.out.println(i);
        }

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        System.out.println("LinkedHashSet  ordered and un sorted . it maintains the insertion order");
        for (Integer i : linkedHashSet) {
            System.out.println(i);
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(4);
        System.out.println("Ascending Order");

        for (Integer i : treeSet) {
            System.out.println(i);
        }

    }

}
