package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

/**
 * @author saumitra chauhan
 */
public class Counting {

    public static void main(String[] args) {

        // simple execution
        long ans = Instructors.getAll().stream().collect(Collectors.counting());
        System.out.println("count:" + ans);

        // used as a downstream operation
        Map<Object, Long> count = Instructors.getAll().stream().collect(
                Collectors.groupingBy(instructor -> (instructor.getYearsOfExperience() >= 10 ? "SENIOR" : "JUNIOR"),
                        counting())
        );

        System.out.println(count);
    }
}

/*
    Despite having a count function, we need this function for the downstream operations as shown in the above example.
*/