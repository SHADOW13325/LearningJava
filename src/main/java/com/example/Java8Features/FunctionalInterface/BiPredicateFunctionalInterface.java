package com.example.Java8Features.FunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateFunctionalInterface {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> factorCheck = (x, y) -> x % y == 0 || y % x == 0;
        BiPredicate<Integer, Integer> positiveCheck = (x, y) -> x > 0 && y > 0;
        BiPredicate<Integer, Integer> valueCheck = (x, y) -> x + y < 1000;

        BiPredicate<Integer, Integer> chainingBiPredicate = factorCheck.and(valueCheck).and(positiveCheck);

        System.out.println("Chaining of BiPredicate " + chainingBiPredicate.test(10, 20));

    }
}

// It is similar to Predicate Functional Interface, but it just takes 2 arguments instead of 1
// It has all default functions as of Predicate Functional Interface except the static method isEqual