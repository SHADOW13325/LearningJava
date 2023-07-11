package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 12:11
 */

public class AssignmentOperators {

    public static void main(String[] args) {

//        Simple Assignment
        int n = 10;


//        Chained Assignment
        int a, b, c, d;
        a = b = c = d = 10;

//        cannot find symbol symbol: variable f symbol: variable g symbol: variable h
//        We are using f, g and h directly and had not declared it.
//        int e = f = g = h = 10;


//        Compound Assignment
        byte i = 10;
        i += 10; // implicit typecasting from int to byte by compiler

//        j variable must be declared first. Hence CE
//        int j += 10;

        int w, x, y, z;
        w = x = y = z = 20;
        w += x -= y *= z /= 2; // execution takes place from right to left
        System.out.printf("w = %d x = %d y = %d z = %d%n", w,x,y,z);

    }
}

/*
    There are 3 types of assignments
        1. Simple
        2. Chained
        3. Compound
    There are 11 types of compound statements.
        => += , -=, *=, /=, %=, &=, |=, ^=, >>=, <<=, >>>=
 */