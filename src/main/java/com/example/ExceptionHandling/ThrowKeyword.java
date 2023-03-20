package com.example.ExceptionHandling;

public class ThrowKeyword {

    public static ArithmeticException arithmeticException;

    public static void main(String[] args) {
//        throwingNullAsExceptionObject();
//        throwingNonThrowableObjects();
//        throwingThrowableObjects();
    }

    public static void throwingNullAsExceptionObject(){
        throw arithmeticException;
//        System.out.println("Will Not execute direct statement after throw keyword");
    }

    public static void throwingNonThrowableObjects() {
//        throw new ThrowKeyword();
    }

    public static void throwingThrowableObjects(){
        throw new ThrowableObject();
    }


}

class ThrowableObject extends RuntimeException {

}

//  throw keyword throws Objects of class Throwable or its child classes and it should not be NULL