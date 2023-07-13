package com.example.BeforeJava8Features.Basic.FlowControl;

/**
 * @author saumitra chauhan
 * @since 11-07-2023 17:57
 */

public class IfElse {

    public static void main(String[] args) {

        boolean condition = true;

//        Simple if
//        variation 1
        if (condition) {int x = 10;}
//        variation 2
        if(condition);
//        variation 3
        if(condition)
            System.out.println("Inside if 1");

//        variable declaration not allowed here
//        if(condition)
//            int x = 10;

//        incompatible types: int cannot be converted to boolean
//        if (1){ System.out.println("Inside if"); }

//        variation 4
        if(condition)
            System.out.println("Inside if 2");
        else if (condition)
            System.out.println("Inside else if 1");
        else
            System.out.println("Inside else 1");


        int x = 10;
        if(x == 20)
            if(x == 10)
                System.out.println("Inside Inside if 1");
        else //This else is associated with 2nd if
                System.out.println("Inside else 2");

//        variation 5
        if (condition) { }
        else { }

//        variation 6
        if (condition) { }
        else if (condition) { }
        else { }



    }
}

/*
    1. The condition argument given must be a boolean else, it will give CE: incompatible types.
    2. Without curly braces only 1 statement is allowed, and it should not be a declarative statement
       as it could not be used again.
    3. Curly braces and else are optional.
    4. There is no dangling else problem in java. Every else is mapped to the nearest if statement.
 */