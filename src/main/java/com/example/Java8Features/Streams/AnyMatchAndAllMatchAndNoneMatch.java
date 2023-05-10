package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchAndAllMatchAndNoneMatch {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(20);
        arrayList.add(5);

        System.out.println("These operations return boolean values as a output");

        boolean value = arrayList.stream().anyMatch(i -> i % 7 == 0);
        System.out.println("AnyMatch function response : " + value);

        value = arrayList.stream().allMatch(i -> i % 7 == 0);
        System.out.println("AllMatch function response : " + value);

        value = arrayList.stream().noneMatch(i -> i % 7 == 0);
        System.out.println("NoneMatch function response : " + value);
    }
}

//  AnyMatch returns true if any stream element satisfies the given condition
//  AllMatch returns true if all stream elements satisfies the given condition
//  NoneMatch returns true if none of the stream elements satisfies the given condition