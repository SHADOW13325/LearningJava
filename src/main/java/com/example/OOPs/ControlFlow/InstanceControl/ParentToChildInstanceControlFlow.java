package com.example.OOPs.ControlFlow.InstanceControl;/*
    @author
    saumitra chauhan
*/

class Parent {

    int i = 10;

    {
        m1();
        System.out.println("Parent First Instance Block");
    }

    Parent(){
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("Parent Main");
    }

    public void m1() {
        System.out.println("j = " + j);
    }

    {
        System.out.println("Parent Second Instance Block");
    }

    int j = 20;
}

class Child extends Parent {

    int x = 100;

    {
        m2();
        System.out.println("Child First Instance Block");
    }

    Child() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("Child Main");
    }

    public void m2(){
        System.out.println("y = " + y);
    }

    {
        System.out.println("Child Second Instance Block");
    }

    int y = 200;
}

// Whenever we are executing a child java class, first static control will be executed. In the static control flow, if we are creating an object, the following sequence of steps will be executed as the part of instance control flow :-
// 1. Identification of instance members from parent to child
// 2. Execution of instance variable assignments and instance blocks only in parent class
// 3. Execution of parent constructor
// 4. Execution of instance variable assignments and instance blocks only in child class
// 5. Execution of child constructor
