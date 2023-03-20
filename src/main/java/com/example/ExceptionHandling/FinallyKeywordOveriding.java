package com.example.ExceptionHandling;

public class FinallyKeywordOveriding {

    public static void main(String[] args) {
        System.out.println("Begin");
//        System.out.println(returnOveridingReturn());
//        System.out.println(returnOveridingThrow());
//        System.out.println(throwOveridingReturn());
//        System.out.println(throwOveridingThrow());
//        System.out.println(returnOveridingFromTryBlock());
        System.out.println("End");
    }

    public static int throwOveridingThrow(){

        try {
            System.out.println("In throwOveridingThrow method");
            System.out.println(10/0);
        } catch (ArithmeticException e){
            throw new RuntimeException("throw from catch");
        } finally {
            throw new RuntimeException("throw from finally");
        }

    }

    public static String throwOveridingReturn(){

        try {
            System.out.println("In throwOveridingReturn method");
            System.out.println(10/0);
        } catch (ArithmeticException e){
            return "return from catch";
        } finally {
            throw new RuntimeException("throw from finally");
        }

    }

    public static String returnOveridingThrow(){

        try {
            System.out.println("In returnOveridingThrow method");
            System.out.println(10/0);
        } catch (ArithmeticException e){
            throw new RuntimeException("throw from catch");
        } finally {
            return "return from finally";
        }

    }

    public static String returnOveridingReturn(){

        try {
            System.out.println("In returnOveridingReturn method");
            System.out.println(10/0);
        } catch (ArithmeticException e){
            return "return from catch";
        } finally {
            return "return from finally";
        }

    }

    public static String returnOveridingFromTryBlock(){


        try {
            System.out.println("In returnOveridingFromTryBlock method");
            return "return from try";
        } catch (ArithmeticException e){
            return "return from catch";
        } finally {
            return "return from finally";
        }

    }
}

//  Finally block statements can override the returns, throw , etc. coming from the catch statement or returns coming from try block