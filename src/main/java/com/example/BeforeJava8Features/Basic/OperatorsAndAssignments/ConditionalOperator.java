package com.example.BeforeJava8Features.Basic.OperatorsAndAssignments;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 12:38
 */

public class ConditionalOperator {

    public static void main(String[] args) {

        int a = 10, b = 20, c;
        a++; // Unary operator
        c = a + b; // Binary operator
        int d = c > 30 ? a : b; // Ternary Operator

        System.out.printf("a = %d b = %d c = %d d = %d%n",a,b,c,d);

        int x = (10 > 20) ? 30 : (40 > 50 ? 60 : 70);
        System.out.println("x = " + x);
    }
}

/*
    Conditional Operator (?:) is the only ternary operator in java.
    Nesting possible in conditional operator.
 */