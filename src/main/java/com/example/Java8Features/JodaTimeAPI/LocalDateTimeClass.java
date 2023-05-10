package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.util.Date;

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
        System.out.println("localDateTime.get() = "
                + dateTime.get(ChronoField.MONTH_OF_YEAR));

        System.out.println("localDateTime.plusYears(3) = " + dateTime.plusYears(3));
        System.out.println("localDateTime.plusHours(4) = " + dateTime.plusHours(4));
        System.out.println("localDateTime.plusMinutes(60) = " + dateTime.plusMinutes(60));
        System.out.println("localDateTime.with(ChronoField) = "
                + dateTime.with(ChronoField.HOUR_OF_DAY,3));
        System.out.println("localDateTime.with(LocalTime) = "
                + dateTime.with(LocalTime.MIDNIGHT));

        LocalDateTime localDateTime = LocalDateTime.of(2020, 9,29, 23,10);
        System.out.println("Created a particular dateTime : " + localDateTime);
        localDateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime = " + localDateTime);
        System.out.println("localDateTime.toLocalDate() = " + localDateTime.toLocalDate());
        System.out.println("localDateTime.toLocalTime() = " + localDateTime.toLocalTime());


        Date date = new Date();
        localDateTime = date.toInstant().
                atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println("localDateTime = " + localDateTime);

        java.sql.Date dateSql = new java.sql.Date(System.currentTimeMillis());
        LocalDate localDate = dateSql.toLocalDate();
        System.out.println("localDate = " + localDate);

    }
}
