package com.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("sudeep");
        collection.add("manu");
        collection.add("Tinu");

        for (String s : collection) {
            System.out.println("String value:" + s);
        }
    }

}
