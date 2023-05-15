package com.example.BeforeJava8Features.OOPs.ControlFlow.StaticControl;
/**
    @author
    saumitra chauhan
*/

public class StaticControlFlow {

    static int i = 10;

    static {
        m1();
        System.out.println("First Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Main Method");
    }

    public static void m1(){
        System.out.println(j);
    }

    static {
        System.out.println("Second Static Block");
    }

    static int j = 20;

}

/*
 Whenever we are executing a java class, the following sequence of steps will be executed as the part of static control flow :-
 1. Identification of static members from top to bottom
 2. Execution of static variable assignments and static blocks from top to bottom
 3. Execution of main method
*/
