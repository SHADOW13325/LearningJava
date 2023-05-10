package com.example.Java8Features.FunctionalInterface;

public class MethodReference {

    public static void main(String[] args) {

        SimpleFunctionalInterface simpleFunctionalInterface = () -> System.out.println("Using Lambda Expression");
        simpleFunctionalInterface.singleAbstractMethod();


        simpleFunctionalInterface = ReferenceClass::testForStaticRef;
        simpleFunctionalInterface.singleAbstractMethod();

        simpleFunctionalInterface = MethodReference::testForStaticRef;
        simpleFunctionalInterface.singleAbstractMethod();


        MethodReference methodReference = new MethodReference();
        simpleFunctionalInterface = methodReference::testForInstanceRef;
        simpleFunctionalInterface.singleAbstractMethod();

        ReferenceClass referenceClass = new ReferenceClass();
        simpleFunctionalInterface = referenceClass::testForInstanceRef;
        simpleFunctionalInterface.singleAbstractMethod();

    }

    public void testForInstanceRef(){
        System.out.println("Using Instance Method Reference of same class");
    }

    public static void testForStaticRef(){
        System.out.println("Using Static Method Reference of same class");
    }
}

class ReferenceClass {

    public static void testForStaticRef(){
        System.out.println("Using Static Method Reference of other class");
    }

    public void testForInstanceRef(){
        System.out.println("Using Instance Method Reference of other class");
    }
}

//  Method Reference is the replacement of lambda expressions. It refers method of functional interface to an existing
//  method for code reusability.
//  The syntax is for
//      static Area -> className::staticMethodName , and
//      Instance Area -> objectRef::instanceMethodName