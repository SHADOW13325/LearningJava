package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author saumitra chauhan
 */
public class AggregateFunctions {

    public static void main(String[] args) {

        // simple execution
        int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);
        double average = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("Average : " + average);
        IntSummaryStatistics summaryStatistics = Instructors.getAll().stream().collect(
                Collectors.summarizingInt(Instructor::getYearsOfExperience));
        System.out.println("Summary : " + summaryStatistics);
        System.out.println("-----------------------------------------------------------------------------------------");

        // used as a downstream operation
        Map<Boolean, IntSummaryStatistics> summaryStatisticsMap = Instructors.getAll().stream().collect(
                Collectors.groupingBy(Instructor::isOnlineCourses,
                        Collectors.summarizingInt(Instructor::getYearsOfExperience)));
        summaryStatisticsMap.forEach( (key, value) ->
                        System.out.println("Key = " + key + " Value = " + value)
                );
    }
}

/*
    Despite having aggregate functions, these functions are required for the downstream operations

    There are other variations for these functions.
    Summing ->
        1. public static <T> Collector<T, ?, Integer> summingInt(ToIntFunction<? super T> mapper)
        2. public static <T> Collector<T, ?, Long> summingLong(ToLongFunction<? super T> mapper)
        3. public static <T> Collector<T, ?, Double> summingDouble(ToDoubleFunction<? super T> mapper)
    Averaging ->
        1. public static <T> Collector<T, ?, Double> averagingInt(ToIntFunction<? super T> mapper)
        2. public static <T> Collector<T, ?, Double> averagingLong(ToLongFunction<? super T> mapper)
        3. public static <T> Collector<T, ?, Double> averagingDouble(ToDoubleFunction<? super T> mapper)
    Summarizing
        1. public static <T> Collector<T, ?, IntSummaryStatistics> summarizingInt(ToIntFunction<? super T> mapper)
        2. public static <T> Collector<T, ?, LongSummaryStatistics> summarizingLong(ToLongFunction<? super T> mapper)
        3. public static <T> Collector<T, ?, DoubleSummaryStatistics> summarizingDouble(ToDoubleFunction<? super T> mapper)

*/