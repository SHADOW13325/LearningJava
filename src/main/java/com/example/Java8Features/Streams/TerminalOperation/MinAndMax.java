package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;

/**
 * @author saumitra chauhan
 */
public class MinAndMax {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("For Minimum and Maximum you can use min() and max() function ");
        System.out.println("Max Value: " + listOfInstructor.stream().max((e1, e2) -> e1.compareTo(e2)).get());
        System.out.println("Min Value: " + listOfInstructor.stream().min((e1, e2) -> e1.compareTo(e2)).get());
    }
}

// Min and Max functions takes a comparator or lambda function as an input and returns an Optional as an output.