package com.example.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;

public class LimitAndSkip {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(10);
        arrayList.add(5);
        arrayList.add(20);
        arrayList.add(11);

        System.out.println("limit(n) method prints first n elements in stream");
        arrayList.stream().limit(2).forEach(System.out::println);

        System.out.println("skip(n) method skips first n elements in stream");
        arrayList.stream().skip(2).forEach(System.out::println);

    }
}
