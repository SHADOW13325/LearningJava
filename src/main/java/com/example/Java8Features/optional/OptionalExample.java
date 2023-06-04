package com.example.Java8Features.optional;

import java.util.Optional;

/**
 * @author saumitra chauhan
 */
public class OptionalExample {
    public static void main(String[] args) {

//       Gives NPE
       // Integer[] numbers = new Integer[10]; 
       // int number = numbers[1].intValue();
       // System.out.println("number = " + number);
        
        Optional<String> optionalString = Optional.of("Hello World");
        System.out.println("optionalString = " + optionalString);
        // using get() method for retrieving the value
        System.out.println("Optional value using get() : " + optionalString.get());

//       Gives NPE if null value provided in of() method
//        optionalString = Optional.of(null);
//        System.out.println("optionalString = " + optionalString);

        System.out.println("getWords: " + getWords());

    }

    public static Optional<String>  getWords() {
        String[] words = new String[10];
        Optional<String> optional = Optional.ofNullable(words[1]);
        System.out.println(optional);
        if (optional.isPresent())
            return optional;
        else
            return Optional.empty();
    }
}

/*
 It helps in avoiding null checks. We can create optional using 2 methods:
      1. of(T value) method -> Here value must be non-null, else RE : NPE
      2. ofNullable(T value) method -> If null value provided, it will return empty() optional;

 We can get Optional value using get() method. It will throw NoSuchElementException in case of empty Optional.
*/
