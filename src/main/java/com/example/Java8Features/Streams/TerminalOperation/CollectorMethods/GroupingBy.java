package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class GroupingBy {

    public static void main(String[] args) {

        Map<String, List<Instructor>> groupByGender = Instructors.getAll().stream().
                collect(Collectors.groupingBy(Instructor::getGender));
        printMap(groupByGender);

        // Collector.filtering() came in Java 1.9 version
        groupByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(
                Instructor -> Instructor.getYearsOfExperience() >= 10 ? "SENIOR" : "JUNIOR",
                Collectors.filtering(Instructor -> Instructor.isOnlineCourses() , Collectors.toList())));
        printMap(groupByGender);

        groupByGender = Instructors.getAll().stream().collect(Collectors.groupingBy(
                Instructor -> Instructor.getYearsOfExperience() >= 10 ? "SENIOR" : "JUNIOR", LinkedHashMap::new,
                Collectors.filtering(Instructor -> Instructor.isOnlineCourses() , Collectors.toList())));
        printMap(groupByGender);
    }

    public static void printMap(Map<?, ?> map){
        map.forEach( (Key, Value) ->
                        System.out.println("Key : " + Key + " Value : " + Value)
                );
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}

/*
    groupingBy function is used to provide similar functionality as SQL GROUPBY.
    It has 3 overloaded methods :-
        1. public static <T, K> Collector<T, ?, Map<K, List<T>>> groupingBy(Function<? super T, ? extends K> classifier)
        2. public static <T, K, A, D> Collector<T, ?, Map<K, D>> groupingBy(Function<? super T, ? extends K> classifier,
            Collector<? super T, A, D> downstream)
        3. public static <T, K, D, A, M extends Map<K, D>> Collector<T, ?, M> groupingBy(Function<? super T, ? extends K>
            classifier, Supplier<M> mapFactory, Collector<? super T, A, D> downstream)

    classifier is used to tell how the data is grouped by on some parameters.
    downstream is used to provide some secondary functionality for each classifier object. It acts as a value for the
    classifier as a key. If not specified, downstream sets to toList() by default.
    mapFactory is used to store the result. If not specified, it sets to hashMap by default.
*/