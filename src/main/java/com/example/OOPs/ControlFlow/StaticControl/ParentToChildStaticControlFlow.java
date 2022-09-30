package com.example.OOPs.ControlFlow.StaticControl;/*
    @author
    saumitra chauhan
*/

class Parent {

    static int i = 10;

    static {
        m1();
        System.out.println("Parent First Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Parent Main");
    }

    public static void m1() {
        System.out.println("j = " + j);
    }

    static {
        System.out.println("Parent Second Static Block");
    }

    static int j = 20;
}

class Child extends Parent{

    static int x = 100;

    static {
        m2();
        System.out.println("Child First static Block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Child Main");
    }

    public static void m2() {
        System.out.println("y = " + y);
    }

    static {
        System.out.println("Child Second Static Block");
    }

    static int y = 200;
}

// Whenever we are executing a child java class, the following sequence of steps will be executed as the part of static control flow :-
// 1. Identification of static members from parent to child
// 2. Execution of static variable assignments and static blocks from parent to child
// 3. Execution of only child class main method