package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamUsecase {

    public static void main(String[] args) {

//        Printing elements divisible by 2
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);

        System.out.println("Without Using Streams");
        List<Integer> numbersDivisbleBy2 = getElements(arrayList);

        for (Integer element : numbersDivisbleBy2){
            System.out.println(element);
        }

        System.out.println("Using Streams");
        arrayList.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

        System.out.println("Creating Streams");
        Stream s = arrayList.stream();
    }

    public static List<Integer> getElements(List<Integer> arrayList){

        List<Integer> newList = new ArrayList<>();

        for (Integer element : arrayList){
            if (element % 2 == 0){
                newList.add(element);
            }
        }

        return newList;
    }
}

//  When we have to process bulk objects, we can use streams
//  It is a iterator class that allows processing of collection of objects in a functional manner.