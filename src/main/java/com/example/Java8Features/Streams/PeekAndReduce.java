package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PeekAndReduce {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(11);

        System.out.println("Peek is used for the debugging to check the values in between");
        long count = arrayList.stream().filter(a -> a % 2 == 0).peek(System.out::println).map(a -> a / 2).filter(a -> a > 5).count();
        System.out.println("Value of above chaining is " + count);

        System.out.println("Reduce is used to combine elements of stream to produce a single value");
        long sum = arrayList.stream().reduce((a, b) -> a + b).get();
        System.out.println("Sum of the array is " + sum);

    }
}
