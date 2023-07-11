package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 07:08
 */

public class OperatorOverloading {

    public static void main(String[] args) {

//        Point 1
        String s = "abc";
        int x = 10, y = 20;
        double z = 40;
        System.out.println(s + x + y + z);
        System.out.println(x + y + z + s);
        System.out.println(x + y + s + z);
        System.out.println(x + s + y + z);
        System.out.println(s + 'a');

//        incompatible types: int cannot be converted to java.lang.String
//        s = x + y + z;
        s = s + y + z;
//        incompatible types: java.lang.String cannot be converted to int
//        x = s + y + z;
        System.out.println(s);

    }
}

/*
    1. In Java, only + is an overloaded operator. Sometimes, it acts as arithmetic addition operator and
       sometimes as String concatenation operator.
    2. If any of the 2 operators is string, the return type becomes string.
    2. The execution proceeds from left to right.
 */