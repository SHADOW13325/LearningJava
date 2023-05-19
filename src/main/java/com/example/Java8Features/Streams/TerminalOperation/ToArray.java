package com.example.Java8Features.Streams.TerminalOperation;

import com.example.Java8Features.Streams.SampleTest.Instructor;
import com.example.Java8Features.Streams.SampleTest.Instructors;

import java.util.List;

/**
 * @author saumitra chauhan
 */
public class ToArray {

    public static void main(String[] args) {

        List<Instructor> listOfInstructor = Instructors.getAll();

        System.out.println("We can collect elements in Object array using toArray() method");
        Object[] objects = listOfInstructor.stream().filter(i -> i.getGender() == "M").toArray();
        for (Object object : objects){
            System.out.println(object.toString());
        }

        System.out.println("We can collect elements in specified array using toArray() method");
        Instructor[] instructors = listOfInstructor.stream().filter(i -> i.getGender() == "M").toArray(Instructor[]::new);
        for (Instructor instructor : instructors){
            System.out.println(instructor);
        }
    }
}

/*
 toArray method is used to copy elements present in the stream to specified array.
 It returns object array by default. We can give a constructor reference for a specified array type.
*/
