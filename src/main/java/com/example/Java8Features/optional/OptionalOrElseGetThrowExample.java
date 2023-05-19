package com.example.Java8Features.optional;

import java.util.Optional;

/**
 * @author saumitra chauhan
 */
public class OptionalOrElseGetThrowExample {
    public static void main(String[] args) {
        //orElse
        Integer[] numbers = new Integer[10]; 
        numbers[0] = 1;

        Optional<Integer> number = Optional.ofNullable(numbers[0]);
        orElseGetThrow(number);

        orElseGetThrow(Optional.empty());
    }

    public static void orElseGetThrow(Optional<Integer> number){

        //orElse
        Object result = number.orElse(-1);
        System.out.println("result = " + result);

        //orElseGet
        result = number.orElseGet(() -> -1);
        System.out.println("result orElseGet = " + result);

        //orElseThrow
        try {
            result = number.orElseThrow(Exception::new);
            System.out.println("result orElseThrow = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 There are some if-else type method in Optional class. If invoked over an optional,
    1. It will return the actual value in case of non-empty optional
    2. It will perform some action assigned to it for empty optional.

 The methods and there actions are:-
    1. T oeElse(T value) -> It return the parameter present. parameter value can be null.
    2. T orElseGet(Supplier<? extends T> other) -> It takes a non-null supplier parameter and gets a value.
    3. <X extends Throwable> T orElseThrow(Supplier<? extends X> exceptionSupplier) throws X -> It takes a
        non-null exception supplier and throws the exception.

*/
