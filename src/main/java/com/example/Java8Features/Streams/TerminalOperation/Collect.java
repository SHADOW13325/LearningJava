package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class Collect {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("For collecting elements after mapping or filtering, we can use collect() method");
        listOfInstructor.stream().filter(i -> i.getGender() == "M").collect(Collectors.toList()).forEach(System.out::println);
    }
}

/*
 Collect method is used for collecting stream after mapping or filtering and add them to the required collection.
 It takes collector as an input and results out the reduction result.
*/
