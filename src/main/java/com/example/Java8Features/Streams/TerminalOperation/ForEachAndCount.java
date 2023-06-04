package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;

/**
 * @author saumitra chauhan
 */
public class ForEachAndCount {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("For processing something for each element, we can use collect() method");
        listOfInstructor.stream().filter(i -> i.getGender() == "M").forEach(System.out::println);

        System.out.println("For counting the total elements present, we can use count() method");
        System.out.println(listOfInstructor.stream().count());
    }
}

/*
 ForEach function takes a consumer as an input and returns no output
 Count function takes no argument and returns a long integer
*/
