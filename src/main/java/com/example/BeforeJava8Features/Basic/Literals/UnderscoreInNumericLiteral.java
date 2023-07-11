package com.example.BeforeJava8Features.Basic.Literals;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 22:19
 */

public class UnderscoreInNumericLiteral {

    public static void main(String[] args) {

        double d = 1_23_456.78_999;
        int e = 1__23___4;

//        Underscores must be between digits
//        double a = _123.456;
//        double b = 123._456;
//        double c = 123.456_;


    }
}

/*
    Underscores helps in improving readability of code. Hence, they are removed at compile time.
    Underscores must be used between digits only.
    There is no limit on no of underscores between 2 digits
 */