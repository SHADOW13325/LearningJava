package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.NonPrimitiveFunctionalInterfaces.SingleArgument;

/**
 * @author saumitra chauhan
 */

import java.util.function.Consumer;

public class ConsumerFunctionalInterface {

    public static void main(String[] args) {

//        Method Reference
        Consumer<Integer> print = ConsumerFunctionalInterface::methodReference;
        print.accept(10);

        Consumer<Integer> printSquare = value -> System.out.println("Square of " + value + " is " + value * value);
        printSquare.accept(10);

//        Consumer Chaining
        Consumer<Integer> printCube = value -> System.out.println("Cube of " + value + " is " + value * value * value);

        Consumer<Integer> chainingUsingAndThen = printSquare.andThen(printSquare).andThen(printCube);
        chainingUsingAndThen.accept(5);

//        Lambda Expression equivalent to above predicate Joining. It just becomes a little messy and less concise

        System.out.println("using Lambda Expression for chaining");

        Consumer<Integer> chainingUsingAndThenUsingLambda = value -> {
            printSquare.accept(value);
            printSquare.accept(value);
            printCube.accept(value);
        };
        chainingUsingAndThen.accept(5);

    }

    public static void methodReference(Integer value){
        System.out.println("Using Method Reference and printing value = " + value);
    }
}

/*
  It is a predefined functional Interface which can have an input, do some process but doesn't give an output.
  We can do Consumer joining by using the default method andThen() of Consumer and join 2 or more consumers.
  We can also use method reference but the method should override to accept() method properly.
  E.g. checking parameters and return types
*/
