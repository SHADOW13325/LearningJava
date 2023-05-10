package com.example.Java8Features.JodaTimeAPI;

import java.time.Year;

public class YearClass {

    public static void main(String[] args) {

        Year year = Year.of(2020);
        System.out.println(year.isLeap());

        year = Year.of(2002);
        System.out.println(year.isLeap());
    }
}
