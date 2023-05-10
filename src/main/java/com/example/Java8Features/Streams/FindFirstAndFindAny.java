package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FindFirstAndFindAny {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(20);
        arrayList.add(5);

        System.out.println("Using sequential streams");
        Integer element = arrayList.stream().filter(i -> i % 5 == 0).findFirst().get();
        System.out.println("FindFirst element : " + element);
        element = arrayList.stream().filter(i -> i % 5 == 0).findAny().get();
        System.out.println("FindFirst element : " + element);

        System.out.println("FindAny With Parallel Stream");
        IntStream.range(1, 10).forEach(ele -> {
            Integer element1 = arrayList.stream().parallel().filter(i -> i % 5 == 0).findAny().get();
            System.out.println(element1);
        });

        System.out.println("FindFirst With Parallel Stream");
        IntStream.range(1, 10).forEach(ele -> {
            Integer element1 = arrayList.stream().parallel().filter(i -> i % 5 == 0).findFirst().get();
            System.out.println(element1);
        });
    }
}

//  FindFirst gives the first element that satisfy the given condition. In case you are using parallel streams,
//  findFirst don't operate on what result came first. It will return the first element occurred in the stream
//  which have satisfies the condition
//  FindAny can give any element that satisfied the condition. It works best in parallel streams performance-wise
//
//  In case of sequential stream, there is no difference in findFirst and findAny
//  In case of findFirst, there is no difference between sequential and parallel streams