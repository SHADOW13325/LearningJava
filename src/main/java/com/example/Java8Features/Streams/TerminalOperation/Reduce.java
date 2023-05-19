package com.example.Java8Features.Streams.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author saumitra chauhan
 */
public class Reduce {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(11);

        System.out.println("Reduce is used to combine elements of stream to produce a single value");
        long sum = arrayList.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum of the array is " + sum);
        sum = arrayList.stream().reduce(10, (a, b) -> a + b);
        System.out.println("Sum of the array after identity operator is " + sum);
        sum = arrayList.stream().reduce(10, (x, y) -> x + y + 1 , (a, b) -> a + b);
        System.out.println("Sum of the array after identity operator and BiFunction is " + sum);
    }
}

/*
 Reduce returns a single value after operating on a stream. It is a terminal operation. It has 3 variations:-
 1. Optional<T> reduce(BinaryOperator<T> accumulator);
 2. T reduce(T identity, BinaryOperator<T> accumulator);
 3. <U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner);
*/