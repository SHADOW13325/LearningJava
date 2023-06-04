package com.example.Java8Features.Streams.IntermediateOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.Comparator;
import java.util.List;

/**
 * @author saumitra chauhan
 */

public class Sorted {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("For sorting elements we can use sorted() function");

//        Natural Sorting Order for above collection
        listOfInstructor.stream().sorted().forEach(System.out::println);
        listOfInstructor.stream().sorted((e1, e2) -> e1.compareTo(e2)).forEach(System.out::println);
        listOfInstructor.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

//        Reverse Sorted Order
        listOfInstructor.stream().sorted((e1, e2) -> e2.compareTo(e1)).forEach(System.out::println);
        listOfInstructor.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        Natural Sorting Order doesn't work for non comparable objects

//        Customized Sorting Order
        listOfInstructor.stream().sorted(Comparator.comparing(Instructor::getYearsOfExperience).thenComparing(Instructor::getName)).forEach(System.out::println);
    }
}

// sorted is an intermediate function which takes a comparator or a lambda function returning int as an argument. It produces a stream.