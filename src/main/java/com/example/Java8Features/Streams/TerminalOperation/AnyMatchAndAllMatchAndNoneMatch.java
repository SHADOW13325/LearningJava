package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;

/**
 * @author saumitra chauhan
 */
public class AnyMatchAndAllMatchAndNoneMatch {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("These operations return boolean values as a output");

        boolean value = listOfInstructor.stream().anyMatch(i -> i.getGender() == "M");
        System.out.println("AnyMatch function response : " + value);

        value = listOfInstructor.stream().allMatch(i -> i.getGender() == "M");
        System.out.println("AllMatch function response : " + value);

        value = listOfInstructor.stream().noneMatch(i -> i.getGender() == "M");
        System.out.println("NoneMatch function response : " + value);
    }
}

/*
  AnyMatch returns true if any stream element satisfies the given condition
  AllMatch returns true if all stream elements satisfies the given condition
  NoneMatch returns true if none of the stream elements satisfies the given condition

  They all takes a predicate and returns a boolean value.
*/
