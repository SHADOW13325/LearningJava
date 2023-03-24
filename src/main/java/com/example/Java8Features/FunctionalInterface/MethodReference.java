package com.example.Java8Features.FunctionalInterface;

public class MethodReference {

    public static void main(String[] args) {

        SimpleFunctionalInterface simpleFunctionalInterface = () -> System.out.println("Using Lambda Expression");
        simpleFunctionalInterface.singleAbstractMethod();
        simpleFunctionalInterface = ReferenceClass::test;
        simpleFunctionalInterface.singleAbstractMethod();
        simpleFunctionalInterface = MethodReference::test;
        simpleFunctionalInterface.singleAbstractMethod();

    }

    public static void test(){
        System.out.println("Using Method Reference of same class");
    }
}

class ReferenceClass {

    public static void test(){
        System.out.println("Using Method Reference of other class");
    }
}

//  Method Reference is the replacement of lambda expressions. It refers method of functional interface to an existing
//  method for code reusability