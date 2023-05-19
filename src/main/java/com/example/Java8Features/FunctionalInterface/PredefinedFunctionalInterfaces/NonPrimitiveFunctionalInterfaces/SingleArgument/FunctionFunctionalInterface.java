package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.NonPrimitiveFunctionalInterfaces.SingleArgument;

/**
 * @author saumitra chauhan
 */

import java.util.function.Function;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {

//        Method Reference
        Function<Integer, Integer> print = FunctionFunctionalInterface::methodReference;
        print.apply(10);

        Function<Integer, Integer> addTen = value -> value + 10;

        System.out.println("Adding 10 to the number result = " + addTen.apply(5));

//        Functional Chaining
        Function<Integer, Integer> cube = value -> value * value * value;

        Function<Integer, Integer> chainingUsingAndThen = addTen.andThen(cube);
        Function<Integer, Integer> chainingUsingCompose = addTen.compose(cube);

        System.out.println("Using Functional Chaining using andThen result = " + chainingUsingAndThen.apply(5));
        System.out.println("Using Functional Chaining using compose result = " + chainingUsingCompose.apply(5));

//        Lambda Expression equivalent to above Functional Joining. It just becomes a little messy
        Function<Integer, Integer> chainingUsingAndThenUsingLambda = value -> cube.apply(addTen.apply(value));
        Function<Integer, Integer> chainingUsingComposeUsingLambda = value -> addTen.apply(cube.apply(value));

        System.out.println("Using Functional Chaining using andThen result = " + chainingUsingAndThenUsingLambda.apply(5));
        System.out.println("Using Functional Chaining using compose result = " + chainingUsingComposeUsingLambda.apply(5));

//        Multiple Chaining Example
        Function<Integer, Integer> square = value -> value * value;
        Function<Integer, Integer> multipleChaining = square.compose(addTen).andThen(addTen).andThen(square).compose(addTen);
        System.out.println("Multiple Chaining result for 1 = " + multipleChaining.apply(1));
        System.out.println("Multiple Chaining result for 2 = " + multipleChaining.apply(2));
        multipleChaining = value -> square.apply(addTen.apply(square.apply(addTen.apply(addTen.apply(value)))));
        System.out.println("Multiple Chaining result using Lambda for 1 = " + multipleChaining.apply(1));
        System.out.println("Multiple Chaining result using Lambda for 2 = " + multipleChaining.apply(2));
//        While breaking the chain into lambda start from right to left as apply method will always be in the rightmost

//        Identity method of Function
        Function<Integer, Integer> identityFunction = Function.identity();
        System.out.println("Identity Function of 10 result = " + identityFunction.apply(10));

    }

    public static Integer methodReference(Integer value){
        System.out.println("Using Method Reference and printing value " + value);
        return null;
    }
}

/*
  It is a predefined functional Interface which can have an input, do some process and give an output.
  We can do Functional joining by using the default methods of Function and join 2 or more functions.
  It can be done by 2 ways using andThen() and compose().
  f1.andThen(f2) => Here f1 executes first and then f2;
  f1.compose(f2) => Here f2 executes first and then f1;
  Identity method is a static method which returns the input itself
  We can also use method reference but the method should override the apply() method properly.
  E.g. checking parameters and return types
*/
