package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 12-07-2023 07:27
 */

public class WhileLoop {

    public static void main(String[] args) {

        boolean x = false;

//        variation 1
        while(x){
            int y = 10;
        }

//        variation 2
        while(x)
            System.out.println("Inside while 1");

//        variation 3
        while(x);

//        variable declaration not allowed here
//        while(x)
//            int y = 10;

//         incompatible types: int cannot be converted to boolean
//        while (1) { System.out.println("Inside while 2");}


//        Unreachable Statements

//        while (true){ System.out.println("Inside while 3"); }
//        System.out.println("Outside while 1"); // unreachable statement

        final int a = 10, b = 20;
//        while (a > b) { System.out.println("Inside while 4"); } // unreachable statement (body of loop)
//        System.out.println("Outside while 2");

//        while (a < b) { System.out.println("Inside while 5"); }
//        System.out.println("Outside while 3"); // unreachable statement

//        Only the value of e is replaced at compile time and not of variable f.
        final int e = 10;
        int f = 20;
        while (e > f){ System.out.println("Inside while 6"); }
        System.out.println("Outside while 4");
    }
}

/*
    1. The condition argument given must be a boolean else, it will give CE: incompatible types.
    2. Curly braces are optional.
    3. Without curly braces only 1 statement is allowed, and it should not be a declarative statement
       as it could not be used again.
    4. If while argument is constant boolean, it can create an unreachable statement.
    5. Every final variable will be replaced by its value at compile time only.
 */