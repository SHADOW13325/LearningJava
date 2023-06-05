package com.example.Java10Features.Features;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author saumitra chauhan
 */

public class TypeInterference {

//    var at class level not allowed
//    var name = "saumitra";

    public static void main(String[] args) {

        //String name = "Mike";
        var name = "Mike";
        System.out.println("name = " + name);

        var dateTime = LocalDateTime.now(); // Similar to LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        // generic and non-generic map
        HashMap<Integer, String> map = new HashMap<>();
        var map1 = new HashMap<Integer, String>();
        map1.put(1, "one");
        map1.put(2, "two");
        System.out.println("map1 = " + map1);
        var map2 = new HashMap<>();
        map2.put(1, "AS");
        map2.put("saa", 45);
        System.out.println("map2 = " + map2);

        //integer array
        int[] numbers = {1,2,3,4,5};
        var numbers1 = new int[] {1,2,3,4,5};
        System.out.println("numbers1 = " + numbers1);

        //list
        List<String> names = new ArrayList<>();
        names.add("Syed");
        names.add("Mike");
        System.out.println("names = " + names);

        var names1 = new ArrayList<>();
        names1.add("Gene");
        names1.add(1.0001);
        names1.add(1);
        System.out.println("names1 = " + names1);

        // Immutable List
        var integers = List.of(1,2,3,4,5);
        integers.forEach(System.out::println);

        //int num = 999999999999999L;
        var num = 99999999999999999L;

        var result = 9/2; //4
        System.out.println("result = " + result);

        var result1 = 9.0/2;
        System.out.println("result1 = " + result1);

        result1 = 11d/2d;
        System.out.println("result1 = " + result1);

        var idiomOfTheDay = "A blessing in disguise";
        printString(idiomOfTheDay);


    }

    public static void printString (String toPrint){
        System.out.println("toPrint = " + toPrint);
    }
}

/*
    From Java 10, we can drop the explicit type depending on whether compiler can infer the type.
    A local variable of type "var" must be initialized with its declaration.
    Compiler must be able to infer the variable, therefore null value is not allowed.
    We cannot define class-level variables. It is only limited to local variables initializers, constructors,
    loops and switch statements
 */