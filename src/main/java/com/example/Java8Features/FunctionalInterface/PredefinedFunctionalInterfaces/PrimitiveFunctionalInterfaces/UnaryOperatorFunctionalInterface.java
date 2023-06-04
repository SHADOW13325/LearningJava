package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.PrimitiveFunctionalInterfaces;
/**
 * @author saumitra chauhan
 */

import java.util.function.*;

public class UnaryOperatorFunctionalInterface {

    public static void main(String[] args) {
        UnaryOperator<Integer> unary = i -> i * 10;
        System.out.println(unary.apply(100));

        Function<Integer, Integer> function = i -> i*10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i *10;
        System.out.println(intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator = i -> i*10;
        System.out.println(longUnaryOperator.applyAsLong(10000000000000000l));

        DoubleUnaryOperator doubleUnaryOperator = i -> i*10;
        System.out.println(doubleUnaryOperator.applyAsDouble(2000000.20000000));
    }

}

/*
 When both inputs and output have same datatype, we can use UnaryOperator.
 Unary operator is the child class of Function.

 Other Variations of UnaryOperator are IntUnaryOperator, LongUnaryOperator, DoubleUnaryOperator.
 They are not extending any other interfaces
*/
