package com.example.Java8Features.Streams;

import java.util.stream.IntStream;

public class ParallelStream {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        IntStream.range(1, 1000).map(i -> i * i).count();
        System.out.println("Sequential Stream time : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        IntStream.range(1, 1000).parallel().map(i -> i * i).count();
        System.out.println("Parallel Stream time : " + (System.currentTimeMillis() - startTime));
    }
}

//  Parallel Stream is used to utilize multiple cores of processor. It divides single stream to multiple
//  streams that executes parallel on separate cores