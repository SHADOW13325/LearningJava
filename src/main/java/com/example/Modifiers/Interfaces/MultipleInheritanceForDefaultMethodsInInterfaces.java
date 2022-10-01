package com.example.Modifiers.Interfaces;

interface Left {
    default void m1() {
        System.out.println("Left Interface m1 method");
    }
}

interface Right {
    default void m1() {
        System.out.println("Right Interface m1 method");
    }
}

public class MultipleInheritanceForDefaultMethodsInInterfaces implements Left, Right{

    public void m1(){
        System.out.println("Our own m1 method");
        Left.super.m1();
        Right.super.m1();
    }

    public static void main(String[] args) {
        MultipleInheritanceForDefaultMethodsInInterfaces multipleInheritanceForDefaultMethodsInInterfaces = new MultipleInheritanceForDefaultMethodsInInterfaces();
        multipleInheritanceForDefaultMethodsInInterfaces.m1();
    }
}

//  We need to overide the default method here else it eill create CE regarding ambiguity