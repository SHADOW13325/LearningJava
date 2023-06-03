package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class MinByMaxBy {

    public static void main(String[] args) {

        // simple execution
        Optional<Instructor> minExpEmployee = Instructors.getAll().stream().collect(Collectors.minBy(
                Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println(minExpEmployee);
        Optional<Instructor> maxExpEmployee = Instructors.getAll().stream().collect(Collectors.maxBy(
                Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println(maxExpEmployee);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

        // used as a downstream operation
        Map<Boolean, Instructor> onlineCourseInstructor = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.collectingAndThen(Collectors.maxBy(
                                Comparator.comparing(Instructor::getYearsOfExperience)), Optional::get)));

        onlineCourseInstructor.forEach( (key, value) ->
                        System.out.println("key : " + key + " value : " + value)
                );

    }
}

/*
    Despite having min and max functions, these functions are required for the downstream operations
*/