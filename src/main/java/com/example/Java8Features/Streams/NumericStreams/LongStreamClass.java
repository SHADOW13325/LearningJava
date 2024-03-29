package com.example.Java8Features.Streams.NumericStreams;

import java.util.Random;
import java.util.stream.LongStream;

/**
 * @author saumitra chauhan
 */
public class LongStreamClass {
    public static void main(String[] args) {
        //of
        LongStream numbers = LongStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);
        System.out.println("----------");

        //iterate
        numbers = LongStream.iterate(0, i->i+2).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("----------");

        //generate
        numbers = LongStream.generate(new Random()::nextLong).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("----------");

        //range
        numbers= LongStream.range(1,5);
        numbers.forEach(System.out::println);
        System.out.println("----------");

        //rangeClosed
        numbers = LongStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);
        System.out.println("----------");
    }
}
