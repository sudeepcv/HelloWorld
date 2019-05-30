package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r=new Random();


        for(int i=0;i<100;i++){
            list.add( r.nextInt(100));
        }

        Comparator c = Collections.reverseOrder();

        Collections.sort(list,c);



        for (Integer i : list) {
            System.out.println("String value:" + i);
        }

    }

}

class customSort implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o1>o2?0:1;
	}

}