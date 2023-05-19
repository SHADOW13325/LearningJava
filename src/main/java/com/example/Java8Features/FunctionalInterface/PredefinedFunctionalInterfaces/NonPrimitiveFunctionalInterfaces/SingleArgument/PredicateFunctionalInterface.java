package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.NonPrimitiveFunctionalInterfaces.SingleArgument;

/**
 * @author saumitra chauhan
 */

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {

//        Method Reference
        Predicate<Integer> print = PredicateFunctionalInterface::methodReference;
        print.test(100);

        Predicate<Integer> valueCheck = value -> value > 10;

        System.out.println("checking Predicate result for 20 = " + valueCheck.test(20));
        System.out.println("checking Predicate result for 10 = " + valueCheck.test(10));

//        Predicate Joining
        Predicate<Integer> modCheck = value -> value % 3 == 0;

        Predicate<Integer> andPredicateJoining = modCheck.and(valueCheck);
        Predicate<Integer> orPredicateJoining = modCheck.or(valueCheck);
        Predicate<Integer> negatePredicate = modCheck.negate();

        System.out.println("Predicate Joining for And result = " + andPredicateJoining.test(100));
        System.out.println("Predicate Joining for Or result = " + orPredicateJoining.test(100));
        System.out.println("Predicate Joining for Negate result = " + negatePredicate.test(100));

//        Lambda Expression equivalent to above predicate Joining. It just becomes a little messy

        Predicate<Integer> andPredicateJoiningUsingLambda = value -> modCheck.test(value) && valueCheck.test(value);
        Predicate<Integer> orPredicateJoiningUsingLambda = value -> modCheck.test(value) || valueCheck.test(value);
        Predicate<Integer> negatePredicateUsingLambda = value -> !modCheck.test(value);

        System.out.println("Lambda Expression for And result = " + andPredicateJoiningUsingLambda.test(100));
        System.out.println("Lambda Expression for Or result = " + orPredicateJoiningUsingLambda.test(100));
        System.out.println("Lambda Expression for Negate result = " + negatePredicateUsingLambda.test(100));

//        Equals method in Predicate
        System.out.println("Predicate equals check result = " + valueCheck.equals(modCheck));
        System.out.println("Predicate equals check result = " + andPredicateJoining.equals(andPredicateJoining));
        System.out.println("Predicate equals check with a object result = " + orPredicateJoining.equals(new Object()));
        System.out.println("Predicate equals check with null result = " + negatePredicate.equals(null));
    }

    public static boolean methodReference(Integer value){
        System.out.println("Using Method Reference and printing value " + value);
        return true;
    }
}

/*
  It is a predefined functional Interface which can be used to check some boolean condition.
  We can do predicate joining by using the default methods of Predicate and join 2 or more predicates
  and make a logical predicate using AND, OR and NEGATE.
  We can also use method reference but the method should override the test() method properly.
  E.g. checking parameters and return types
*/
