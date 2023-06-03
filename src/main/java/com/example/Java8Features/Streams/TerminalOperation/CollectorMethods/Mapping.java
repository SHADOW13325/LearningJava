package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class Mapping {

    public static void main(String[] args) {


        // simple execution
        List<String> namesList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        namesList.forEach(System.out::println);

        // used as a downstream operation
        Map<Integer, List<String>> expAndNamesMap = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::getYearsOfExperience,
                Collectors.mapping(Instructor::getName, Collectors.toList())));

        expAndNamesMap.forEach((key, value) ->
                        System.out.println("key: " + key + " value: " + value)
                );
    }
}

/*
    Despite having map function, we need this function for the downstream operations.
 */