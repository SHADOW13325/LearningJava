package com.example.BeforeJava8Features.OOPs.ControlFlow.InstanceControl;
/**
    @author
    saumitra chauhan
*/

public class InstanceControlFlow {

    int i = 10;

    {
        m1();
        System.out.println("First Instance Flow");
    }

    InstanceControlFlow() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main First Statement");
        InstanceControlFlow ICF = new InstanceControlFlow();
        System.out.println("Main Second Statement");
    }

    public void m1(){
        System.out.println("j = " + j);
    }

    {
        System.out.println("Second Instance Block");
    }

    int j = 20;
}

/*
 Whenever we are executing a java class, first static control will be executed. In the static control flow, if we are creating an object, the following sequence of steps will be executed as the part of instance control flow :-
 1. Identification of instance members from top to bottom
 2. Execution of instance variable assignments and instance blocks from top to bottom
 3. Execution of constructor
*/
