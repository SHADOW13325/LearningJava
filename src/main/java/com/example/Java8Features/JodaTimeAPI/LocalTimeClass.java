package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeClass {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();
        System.out.println("LocalTime : " + time);
        System.out.println("Hours : " + time.getHour());
        System.out.println("Minutes : " + time.getMinute());
        System.out.println("Seconds : " + time.getSecond());
        System.out.println("Nanoseconds : " + time.getNano());
        System.out.println("localTime.get(ChronoField) = "
                + time.get(ChronoField.SECOND_OF_DAY));
        System.out.println("localTime.get(ChronoField) = " +
                time.get(ChronoField.MINUTE_OF_DAY));


        LocalTime localTime = LocalTime.of (15, 18);
        System.out.println("localTime = " + localTime);

        localTime = LocalTime.of(15, 18, 22);
        System.out.println("localTime = " + localTime);

        localTime = LocalTime.of(15,18,23,22222222);
        System.out.println("localTime = " + localTime);

        localTime = LocalTime.now();

        System.out.println("localTime.plusHours(2) = " + localTime.plusHours(2));
        System.out.println("localTime.plusMinutes(22) = " + localTime.plusMinutes(22));
        System.out.println("localTime.plusSeconds(30) = " + localTime.plusSeconds(30));
        System.out.println("localTime.plusNanos(222222) = " + localTime.plusNanos(222222));
        System.out.println("localTime.minusHours(2) = " + localTime.minusHours(2));
        System.out.println("localTime.minus(ChroUnit.) = "
                + localTime.minus(2, ChronoUnit.HOURS));

        System.out.println("localTime.with(LocalTime.MIDNIGHT) = "
                + localTime.with(LocalTime.MIDNIGHT));
        System.out.println("localTime.with(ChronoField) = "
                + localTime.with(ChronoField.HOUR_OF_DAY,4));

    }
}
