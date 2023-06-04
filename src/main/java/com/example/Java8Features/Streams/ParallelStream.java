package com.example.Java8Features.Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author saumitra chauhan
 */
public class ParallelStream {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        IntStream.range(1, 1000).map(i -> i * i).count();
        System.out.println("Sequential Stream time : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().map(i -> i * i).count();
        System.out.println("Parallel Stream time : " + (System.currentTimeMillis() - startTime));

//        2 ways to create parallel Stream
        Stream parallelStream1 = Arrays.asList(1, 2, 3, 4, 5).parallelStream();
        Stream parallelStream2 = Arrays.asList(1, 2, 3, 4, 5).stream().parallel();
    }
}

/*
  Parallel Stream is used to utilize multiple cores of processor. It divides single stream to multiple
  streams that executes parallel on separate cores
*/
