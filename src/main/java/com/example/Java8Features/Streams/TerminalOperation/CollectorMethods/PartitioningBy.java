package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class PartitioningBy {

    public static void main(String[] args) {

        Predicate<Instructor> expPredicate = (instructor -> instructor.getYearsOfExperience() >= 10);
        Map<Boolean, List<Instructor>> expMap = Instructors.getAll().stream().collect(
                Collectors.partitioningBy(expPredicate));
        printMap(expMap);
        Map<Boolean, Set<Instructor>> expSet = Instructors.getAll().stream().collect(
                Collectors.partitioningBy(expPredicate, Collectors.toSet()));
        printMap(expSet);
    }

    public static void printMap(Map map){

        map.forEach( (key, value) ->
                        System.out.println("key : " + key + " value " + value)
                );
        System.out.println("----------------------------------------------------------------------------------------");
    }
}

/*
    This function is used to partition a stream of objects based on a given predicate.
    It has 2 overloaded functions:-
        1. public static <T> Collector<T, ?, Map<Boolean, List<T>>> partitioningBy(Predicate<? super T> predicate)
        2. public static <T, D, A> Collector<T, ?, Map<Boolean, D>> partitioningBy(Predicate<? super T> predicate,
            Collector<? super T, A, D> downstream)
 */