package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 12-07-2023 08:10
 */

public class DoWhileLoop {

    public static void main(String[] args) {

        boolean x = false;

//        variation 1
        do {
            int y = 10;
        } while(x);

//        variation 2
        do
            System.out.println("Inside while 1");
        while (x);

//        variation 3
        do;
        while(x);

//        variable declaration not allowed here
//        do
//            int y = 10;
//        while (x);

//         incompatible types: int cannot be converted to boolean
//        do { System.out.println("Inside while 2");}
//        while (1);

//        No body found here after or while missing here.
//        do
//        while(x); // This is considered as body of do. Hence, while is missing.


//        Unreachable Statements

//        do { System.out.println("Inside while 3"); }
//        while (true);
//        System.out.println("Outside while 1"); // unreachable statement

        final int a = 10, b = 20;
//        do { System.out.println("Inside while 4"); }
//        while (a < b);
//        System.out.println("Outside while 2"); // unreachable statement

        do { System.out.println("Inside while 5"); }
        while (a > b);
        System.out.println("Outside while 3"); // Reachable statement

//        Only the value of e is replaced at compile time and not of variable f.
        final int e = 10;
        int f = 20;
        do { System.out.println("Inside while 6"); }
        while (e > f);
        System.out.println("Outside while 4");
    }
}

/*
    1. The condition argument given must be a boolean else, it will give CE: incompatible types.
    2. Curly braces are optional. But semicolon and while are mandatory.
    3. Without curly braces only 1 statement is allowed, and it should not be a declarative statement
       as it could not be used again.
    4. If while argument is constant boolean, it can create an unreachable statement.
    5. Every final variable will be replaced by its value at compile time only.
    6. Do while is a single statement
 */