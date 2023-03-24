package com.example.Java8Features.FunctionalInterface;

@FunctionalInterface
public interface SimpleFunctionalInterface {

    public void singleAbstractMethod();

    default void defaultMethod1(){
        System.out.println("In Default Method 1 of Interface");
    }

    default void defaultMethod2(){
        System.out.println("In Default Method 2 of Interface");
    }

    public static void staticMethod1(){
        System.out.println("In Static Method 1 of Interface");
    }

    public static void staticMethod2(){
        System.out.println("In Static Method 2 of Interface");
    }
}

//  Rules to create Functional Interface
//  1. Create Interface
//  2. Use @FunctionalInterface Annotation over the Interface
//  3. It must have exactly 1 abstract method
//  4. No Limit on Default and Static Methods
//  There are many functional interfaces already present in java. Eg: Comparable, Runnable