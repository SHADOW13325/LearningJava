package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 09:44
 */

public class BitwiseOperators {

    public static void main(String[] args) {

//        Simple Bitwise Operators (&, |, ^)

//        Boolean Type
        System.out.println(true & false);
        System.out.println(true | false);
        System.out.println(true ^ false);

//        Integral Type
        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);
        System.out.println('a' ^ 'b'); // char is promoted to int

//        bad operand types for binary operator '&' first type:  double second type: int
//        System.out.println(4.0 & 5);


//        Bitwise Compliment Operator(~)
        System.out.println(~5);

//        bad operand type double for unary operator '~'
//        System.out.println(~5.0);

//        bad operand type boolean for unary operator '~'
//        System.out.println(~false);


//        Booleam Compliment Operator(!)
        System.out.println(!false);

//        bad operand type int for unary operator '!'
//        System.out.println(!5);

//        bad operand type double for unary operator '!'
//        System.out.println(!5.0);


//        Shift Operators
        int x = 10;
        System.out.println("Right Shift >> : " + (x>>1));
        System.out.println("Left Shift << : " + (x<<1));
        System.out.println("Unsigned Right Shift >>> : " + (x>>>1));

//        bad operand types for binary operator '>>' first type:  double second type: int
//        System.out.println(10.0>>1);

//        bad operand types for binary operator '>>' first type:  boolean second type: int
//        System.out.println(false>>1);


    }
}

/*
    Simple Bitwise Operators (&, |, ^) are applicable for both boolean and integral types.
    Bitwise Compliment Operator (~) is applicable only for integral type.
    Boolean Compliment Operator (!) is applicable only for boolean type.
    Shift Operators (<<, >>, >>>) are only applicable for integral type.
    char is promoted to int if used with these operators
 */