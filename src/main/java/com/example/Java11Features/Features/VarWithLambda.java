package com.example.Java11Features.Features;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * @author saumitra chauhan
 */

public class VarWithLambda {

    public static void main(String[] args) {

        var instructors = Instructors.getAll();
        Predicate<Instructor> experiencePredicate = (var s) ->
                s.getYearsOfExperience() >= 10;
        instructors.forEach(instructor -> {
            if(experiencePredicate.test(instructor)){
                var result = instructor.getName();
                System.out.println("result = " + result);
            }
        });

        BiFunction<Integer,Integer,Integer> sum = (var x, var y) -> x + y;
        System.out.println("sum.apply(2,4) = " + sum.apply(2,4));

//        Mixing of implicit and explicit type not allowed
//        BiFunction<Integer,Integer,Integer> sum1 = (var x, int y) -> x + y;

    }

}

/*
    With Java 11, var is now available for use with lambda parameters. Eg.
    (var x, var y) -> x + y;
    We cannot mix implicit and explicit type. Eg.
    (var x, int y) -> x + y;
 */