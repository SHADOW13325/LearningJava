package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.PrimitiveFunctionalInterfaces;
/**
 * @author saumitra chauhan
 */

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorFunctionalInterface {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2,4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7,8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(7,8));

        IntBinaryOperator intBi = (a, b) -> a*b;
        System.out.println(intBi.applyAsInt(2,4));

        LongBinaryOperator longBi = (a, b) -> a*b;
        System.out.println(longBi.applyAsLong(20000000l, 22222222222222222l));

        DoubleBinaryOperator doubleBi = (a, b) -> a*b;
        System.out.println(doubleBi.applyAsDouble(2222.22222, 22222222222222.22222));

    }
}

/*
 When both inputs and output have same datatype, we can use BinaryOperator.
 Binary operator is the child class of BiFunction. It includes 2 more functions which are:-
    1. public static <T> BinaryOperator<T> minBy(Comparator<? super T> comparator){...}
    2. public static <T> BinaryOperator<T> maxBy(Comparator<? super T> comparator){...}

 Other Variations of BinaryOperator are IntBinaryOperator, LongBinaryOperator, DoubleBinaryOperator.
 They are not extending any other interfaces
*/
