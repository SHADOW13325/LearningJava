package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 12-07-2023 08:43
 */

public class ForLoop {

    public static void main(String[] args) {

//        variation 1
        for (int i = 0; i < 2; i++)
            System.out.println("Inside for loop 1 Iteration " + i);

//        variation 2
        for (int i = 0; i < 2; i++);

//        variation 3
        for (;;)
            break;

//        variation 4
//        for (;;); // Infinite Loop

//        for (int i = 0; i < 2; i++)
//            int x = 10; //variable declaration not allowed here


//        Unreachable Statements

//        for (int i = 0; true; i++){ System.out.println("Inside for loop 2"); }
//        System.out.println("Outside For Loop 1"); // unreachable statement

        final int a = 10, b = 20;
//        for (int i = 0; a < b; i++) { System.out.println("Inside for loop 3"); }
//        System.out.println("Outside For Loop 2"); // unreachable statement

//        for (int i = 0; a > b; i++) { System.out.println("Inside for loop 4"); } // unreachable statement (loop body)
//        System.out.println("Outside For Loop 3");

//        Only the value of c is replaced at compile time and not of variable d.
        final int c = 10;
        int d = 20;
        for (int i = 0; c > d; i++) { System.out.println("Inside while 6"); }
        System.out.println("Outside while 4");
    }
}

/*
    1. Curly braces are optional.
    2. Without curly braces only 1 statement is allowed, and it should not be a declarative statement.
    3. Initialisation section, conditional check and increment/decrement section are optional. Compiler will place
       true in place if a conditional check is not provided.
    4. We can have only 1 statement in each of the sections. The statement can be any valid java statement.
    5. If a conditional check section has a constant boolean, it can create an unreachable statement.
    6. Every final variable will be replaced by its value at compile time only.
 */