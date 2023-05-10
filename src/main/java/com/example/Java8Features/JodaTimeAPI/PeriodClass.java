package com.example.Java8Features.JodaTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

    public static void main(String[] args) {

        LocalDate present = LocalDate.now();
        LocalDate newYear = LocalDate.of(2030, 12, 31);
        Period remainingTime = Period.between(present, newYear);
        System.out.println("Time Remaining : " + remainingTime);
    }
}
