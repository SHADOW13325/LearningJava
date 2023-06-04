package com.example.Java8Features.Streams;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @author saumitra chauhan
 */
public class StreamGenerators {
    public static void main(String[] args) {
        //of
        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
        stream.forEach(System.out::println);

        System.out.println("-----------");
        //iterate generate a stream of 10 even numbers
        Stream<Integer> stream1 = Stream.iterate(0,i->i+2).limit(10);
        stream1.forEach(System.out::println);

        System.out.println("--------------");
        //generate 10 random numbers
        Stream<Integer> stream2 = Stream.generate(new Random()::nextInt).limit(10);
        stream2.forEach(System.out::println);



    }
}

/*
 Of generates a stream of non-collection objects.
 iterate takes a seed(initial) value and a unary operator to calculate iteratively infinite stream elements.
 generate takes a supplier for getting sequential infinite stream elements.
*/
