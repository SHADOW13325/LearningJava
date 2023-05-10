package com.example.Java8Features.JodaTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantClass {

    public static void main(String[] args) {

        Instant timestamp = Instant.now();
        System.out.println("timestamp.getNano() = " + timestamp.getNano());

        Instant timestamp1 = Instant.now().plusSeconds(3600);
        Duration duration = Duration.between(timestamp1,timestamp);
        System.out.println("duration.toSeconds() = " + duration.toMillis());

        LocalDateTime ld = LocalDateTime.ofInstant(timestamp1, ZoneId.systemDefault());
        System.out.println("ld = " + ld);
    }
}
