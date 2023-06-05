package com.example.Java8Features.JodaTimeAPI;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationClass {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.now().plusHours(2);
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println("duration.toHours() = " + duration.toHours());

        duration = Duration.ofHours(3);
        System.out.println("duration.toMinutes() = " + duration.toMinutes());

        LocalTime localTime = LocalTime.now();
        LocalTime localTime1 = LocalTime.now().plusMinutes(60);
        duration = Duration.between(localTime, localTime1);
        System.out.println("duration = " + duration.toMinutes());
        
    }
}
