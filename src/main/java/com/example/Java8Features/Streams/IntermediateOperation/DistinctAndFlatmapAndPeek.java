package com.example.Java8Features.Streams.IntermediateOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.Arrays;
import java.util.List;

/**
 * @author saumitra chauhan
 */
public class DistinctAndFlatmapAndPeek {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();
        System.out.println("For flattening a list of lists into single, we can use flatmap");
        listOfInstructor.stream().flatMap(instructor -> instructor.getCourses().stream()).forEach(s -> System.out.print(s + " , "));

        System.out.println("For getting all unique elements we can use distinct()");
        Arrays.asList(1,1,1,2,2).stream().distinct().forEach(System.out::println);

        System.out.println("For checking value in between stream we can use peek()");
        listOfInstructor.stream().filter(i -> i.getGender() == "F").peek(i -> System.out.println(i.getName())).forEach(System.out::println);
    }
}

/*
 distinct takes stream as an input and gives stream as an output.
 flatMap takes a stream of stream as an input and produces a single stream as an output.

 There are other variations to flatMap:-
 1. IntStream flatMapToInt(Function<? super T, ? extends IntStream> mapper);
 2. LongStream flatMapToLong(Function<? super T, ? extends LongStream> mapper);
 3. DoubleStream flatMapToDouble(Function<? super T, ? extends DoubleStream> mapper);

 Peek helps in the debugging where we want to see the elements at a certain point.
 It takes consumer as an input and returns out the current stream.
*/
