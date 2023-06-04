package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.NonPrimitiveFunctionalInterfaces.DoubleArgument;

/**
 * @author saumitra chauhan
 */

import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {

        BiConsumer<Integer, Integer> printAddition = (x, y) -> System.out.println("Sum is " + (x + y));
        printAddition.accept(10, 20);

        BiConsumer<Integer, Integer> printMultiplication = (x, y) -> System.out.println("Multiplication is " + (x * y));

        BiConsumer<Integer, Integer> chainingUsingAndThen = printMultiplication.andThen(printMultiplication).andThen(printAddition);
        chainingUsingAndThen.accept(20, 30);
    }
}

/*
 It is similar to Consumer Functional Interface, but it just takes 2 arguments instead of 1
 It has all default methods of Consumer Functional Interface
*/
