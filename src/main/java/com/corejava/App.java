package com.corejava;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;


public class App {
    public static void main(String[] args) {

        Date oldDate=new Date();

        System.out.println("oldDate:"+oldDate);

        LocalDate ld= LocalDate.now();
        System.out.println("ld:"+ld);

        LocalTime lt=LocalTime.now();

        System.out.println("lt:"+lt);






    }



}


