package com.corejava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("name", "sudeep");
        map.put("age", "29");
        map.put("place", "kochi");

        System.out.println(map);
        System.out.println("using keys:");
        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(map.get(key));
        }

        System.out.println("using values:");
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        Set<Entry<String, String>> entryset = map.entrySet();

        System.out.println("using entryset");
        for (Entry<String, String> entry : entryset) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println("using iterator");
        Iterator<Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Entry<String, String> entry = it.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }

    }

}
