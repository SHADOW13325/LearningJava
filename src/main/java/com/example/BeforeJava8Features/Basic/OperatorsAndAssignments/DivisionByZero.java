package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

import static java.lang.Double.NaN;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 06:43
 */

public class DivisionByZero {

    public static void main(String[] args) {

//        Integral Arithmetic
//        java.lang.ArithmeticException: / by zero
//        System.out.println(10/0);
//        System.out.println(-10/0);
//        System.out.println(0/0);

//        Floating Point Arithmetic
        System.out.println("1. " + 10/0.0);
        System.out.println("2. " + 10.0/0);
        System.out.println("3. " + -10/0.0);
        System.out.println("4. " + -10.0/0);
        System.out.println("5. " + 0/0.0);
        System.out.println("6. " + 0.0/0);
        System.out.println("7. " + -0/0.0);
        System.out.println("8. " + -0.0/0);
        double x = NaN;
        System.out.println("NaN value: " + x);

//        NaN Nature
        double y = 10;
        System.out.println("y < NaN : " + (y < NaN));
        System.out.println("y <= NaN : " + (y <= NaN));
        System.out.println("y > NaN : " + (y > NaN));
        System.out.println("y >= NaN : " + (y >= NaN));
        System.out.println("y == NaN : " + (y == NaN));
        System.out.println("y != NaN : " + (y != NaN));
        System.out.println("NaN == NaN : " + (NaN == NaN));
        System.out.println("NaN != NaN : " + (NaN != NaN));


    }
}

/*
    1. There is a way to store infinities for Floating Point Arithmetic in java
       but there is no way for Integral Arithmetic.
    2. If in Floating Point Arithmetic, the result gets undefined, it gives output as NaN(Not a Number)
    3. All operations with NaN except != results in false.
    4. Division and Modulo are the only reason that can cause Arithmetic Exception. Hence, they are only possible in
       Integral Arithmetic and not in Floating Point Arithmetic. It is a Runtime Exception.
 */