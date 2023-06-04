package com.example.Java8Features.Streams.NumericStreams;

import com.example.Java8Features.Streams.SampleTest.RandomIds;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author saumitra chauhan
 */

public class MapToObjIntLongDoubleExample {
    public static void main(String[] args) {
        List<RandomIds> randomIds = IntStream.rangeClosed(0,5)
                .mapToObj((i) ->
                     new RandomIds(i, ThreadLocalRandom.current().nextInt(100))
                ).collect(Collectors.toList());

        randomIds.forEach(System.out::println);
        System.out.println("------------");

        LongStream longStream = IntStream.rangeClosed(0,5).mapToLong(i -> (long)i);
        longStream.forEach(System.out::println);
        System.out.println("------------");

        DoubleStream doubleStream = LongStream.rangeClosed(0,5).mapToDouble(i -> (double)i);
        doubleStream.forEach(System.out::println);
        System.out.println("------------");

        IntStream intStream = LongStream.rangeClosed(0, 5).mapToInt(i -> (int)i);
        intStream.forEach(System.out::println);
        System.out.println("------------");
    }
}

// Operations for converting one stream to another stream

