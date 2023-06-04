package com.example.Java8Features.Streams.IntermediateOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;

/**
 * @author saumitra chauhan
 */
public class LimitAndSkip {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("limit(n) method prints first n elements in stream");
        listOfInstructor.stream().limit(2).forEach(System.out::println);

        System.out.println("skip(n) method skips first n elements in stream");
        listOfInstructor.stream().skip(2).forEach(System.out::println);
    }
}

/*
 The limit(n) function passes first n elements
 The skip(n) function discards first n elements
 n is a long integer and can't be negative
*/
