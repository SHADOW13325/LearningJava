package com.example.Java12Features.Enhancements;

/**
 * @author saumitra chauhan
 */
public class SwitchExpression {

    public static void main(String[] args) {

        String month="JANUARY";
        String quarter = switch(month){
            case "JANUARY", "FEBURARY", "MARCH" -> "FIRST QUARTER";
            case "APRIL", "MAY", "JUNE" -> "SECOND QUARTER";
            case "JULY", "AUGUST", "SEPTEMBER" -> "THIRD QUARTER";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "FOURTH QUARTER";
            default -> "UNKNOWN QUARTER";
        };
        System.out.println("quarter = " + quarter);

    }
}

/*
    In Switch Expression, there is no need for the break statement as no fall through will happen.
    With this the code is concise and easy to write.
 */