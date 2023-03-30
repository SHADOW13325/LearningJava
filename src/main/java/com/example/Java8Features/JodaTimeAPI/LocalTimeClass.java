package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalTime;

public class LocalTimeClass {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime : " + time);
        System.out.println("Hours : " + time.getHour());
        System.out.println("Minutes : " + time.getMinute());
        System.out.println("Seconds : " + time.getSecond());
        System.out.println("Nanoseconds : " + time.getNano());

    }
}
