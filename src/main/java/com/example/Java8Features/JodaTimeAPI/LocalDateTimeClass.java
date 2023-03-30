package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeClass {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("LocalDateTime : " + dateTime);
        System.out.println("Year : " + dateTime.getYear());
        System.out.println("Month : " + dateTime.getMonth());
        System.out.println("Month Value : " + dateTime.getMonthValue());
        System.out.println("Day of the Year : " + dateTime.getDayOfYear());
        System.out.println("Day of the Week : " + dateTime.getDayOfWeek());
        System.out.println("Day Of Month : " + dateTime.getDayOfMonth());
        System.out.println("Hours : " + dateTime.getHour());
        System.out.println("Minutes : " + dateTime.getMinute());
        System.out.println("Seconds : " + dateTime.getSecond());
        System.out.println("Nanoseconds : " + dateTime.getNano());

        LocalDateTime localDateTime = LocalDateTime.of(2020, 9,29, 23,10);
        System.out.println("Created a particular dateTime : " + localDateTime);

        System.out.println("Adding hours : " + localDateTime.plusHours(70));
        System.out.println("Subtracting Months : " + localDateTime.minusMonths(2));

    }
}
