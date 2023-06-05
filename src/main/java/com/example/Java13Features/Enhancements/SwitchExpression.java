package com.example.Java13Features.Enhancements;

import java.time.LocalDate;

/**
 * @author saumitra chauhan
 */
public class SwitchExpression {

    public static void main(String[] args) {

        String month="JANUARY";
        String quarter = switch(month){
            case "JANUARY", "FEBURARY", "MARCH" -> {
                var isLeapYear = LocalDate.now().plusYears(1).isLeapYear();
                yield (isLeapYear ? "FIRST QUARTER - LEAP YEAR": "FIRST QUARTER");
            }
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);

    }
}

/*
    In Java 13 yield keyword is introduced to return a value from the switch expression.
 */