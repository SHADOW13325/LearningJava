package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author saumitra chauhan
 */
public class FindFirstAndFindAny {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("Using sequential streams");
        Instructor element = listOfInstructor.stream().filter(i -> i.getGender() == "M").findFirst().get();
        System.out.println("FindFirst element : " + element);
        element = listOfInstructor.stream().filter(i -> i.getGender() == "M").findAny().get();
        System.out.println("FindAny element : " + element);

        System.out.println("FindAny With Parallel Stream");
        IntStream.range(1, 10).forEach(ele -> {
            Instructor element1 = listOfInstructor.stream().parallel().filter(i -> i.getGender() == "M").findAny().get();
            System.out.println(element1);
        });

        System.out.println("FindFirst With Parallel Stream");
        IntStream.range(1, 10).forEach(ele -> {
            Instructor element1 = listOfInstructor.stream().parallel().filter(i -> i.getGender() == "M").findFirst().get();
            System.out.println(element1);
        });
    }
}

/*
  FindFirst gives the first element that satisfy the given condition. In case you are using parallel streams,
  findFirst don't operate on what result came first. It will return the first element occurred in the stream
  which have satisfies the condition
  FindAny can give any element that satisfied the condition. It works best in parallel streams performance-wise

  In case of sequential stream, there is no difference in findFirst and findAny
  In case of findFirst, there is no difference between sequential and parallel streams

  They both return an Optional as an output
*/
