package com.example.Java8Features.JodaTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneAPI {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("Current Zone : " + zoneId);
        System.out.println("Zone Counts : " + ZoneId.getAvailableZoneIds().stream().count());
//        ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);

        ZoneId laZone = ZoneId.of("America/Los_Angeles");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(laZone);
        System.out.println("LA Zone : " + zonedDateTime);

    }
}
