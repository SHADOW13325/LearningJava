package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConfigurationOfStreams {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);

        System.out.println("For Filtering of elements we use filter config");
        Stream stream1 = arrayList.stream().filter(i -> i % 2 == 0);
        stream1.forEach(System.out::println);

        System.out.println("For doing an operation to each stream object use map config");
        Stream stream2 = arrayList.stream().map(i -> i * i);
        stream2.forEach(System.out::println);
    }
}

// These 2 methods filter and map are intermediate process for configuration.
// Filter takes a predicate functional interface as an input.
// Map takes consumer functional interface as an input