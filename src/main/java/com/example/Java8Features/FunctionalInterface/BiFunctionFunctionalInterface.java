package com.example.Java8Features.FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionFunctionalInterface {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;
        System.out.println("Multiplication Result is " + multiply.apply(10,20));

//        BiFunction<Integer, Integer, Integer> chainingBetweenBiFunctions = multiply.andThen(multiply);
        Function<Integer, Integer> addThree = x -> x + 3;

        BiFunction<Integer, Integer, Integer> chainingBetweenBiFunctionAndFunction = multiply.andThen(addThree).andThen(addThree);
        System.out.println("Chaining Between BiFunction and Function " + chainingBetweenBiFunctionAndFunction.apply(10, 20));
    }
}

// It is similar to Function Functional Interface, but it just takes 2 arguments instead of 1.
// Also chaining Between two BiFunction is not possible as the BiFunction requires 2 parameters but the return will be only 1.
// This is the reason that there is no compose method in BiFunction as the result will return a single value for the BiFunction
// For Chaining using BiFunction, there should only be 1 BiFunction, and it should be executed always first.
// After that Function Chaining can only be done.
// BiFunction have only 1 default method asThen(). compose default method is removed as well as the static method identity