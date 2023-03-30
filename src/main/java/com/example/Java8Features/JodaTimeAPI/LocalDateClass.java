package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalDate;

public class LocalDateClass {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("LocalDate : " + date);
        System.out.println("Year : " + date.getYear());
        System.out.println("Month : " + date.getMonth());
        System.out.println("Month Value : " + date.getMonthValue());
        System.out.println("Day of the Year : " + date.getDayOfYear());
        System.out.println("Day of the Week : " + date.getDayOfWeek());
        System.out.println("Day Of Month : " + date.getDayOfMonth());

    }
}
