package com.example.Java8Features.Streams.IntermediateOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;
import java.util.stream.Stream;
/**
 * @author saumitra chauhan
 */
public class FilterAndMap {

    public static void main(String[] args) {
        List<Instructor> listOfInstructors = Instructors.getAll();

        System.out.println("For Filtering of elements we use filter config");
        Stream stream1 = listOfInstructors.stream().filter(i -> i.getGender() =="M");
        stream1.forEach(System.out::println);

        System.out.println("For doing an operation to each stream object use map config");
        Stream stream2 = listOfInstructors.stream().map(i -> i.getYearsOfExperience());
        stream2.forEach(System.out::println);
    }

}

/*
 These 2 methods filter and map are intermediate process for configuration.
 Filter takes a predicate functional interface as an input and produces a stream.
 Map takes consumer functional interface as an input and produces a stream
*/