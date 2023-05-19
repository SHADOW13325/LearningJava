package com.example.Java8Features.Streams.IntermediateOperation;

import java.util.stream.Stream;

/**
 * @author saumitra chauhan
 */
public class Of {

    public static void main(String[] args) {

        System.out.println("For Using Streams apart from collections, we can use of() method");
        Stream.of(5, 10, 15, 20).filter(i -> i % 2 == 0).forEach(System.out::println);
        String[] name ={"Amar", "Akbar", "Anthony"};
        Stream.of(name).filter(i -> i.length() <= 5).forEach(System.out::println);
    }
}

// Of produces a stream as an output