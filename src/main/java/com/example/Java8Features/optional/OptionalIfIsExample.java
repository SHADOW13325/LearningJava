package com.example.Java8Features.optional;

import java.util.Optional;

/**
 * @author saumitra chauhan
 */
public class OptionalIfIsExample {
    public static void main(String[] args) {
        //isPresent
        Optional<String> stringOptional = Optional.ofNullable("Hello World");
        if(stringOptional.isPresent())
            System.out.println("stringOptional = " + stringOptional);

        stringOptional.ifPresent(s -> System.out.println("s = " + s));
    }
}

/*
 isPresent() method returns true for non-null value in optional
 ifPresent(Consumer c) method takes a non-null consumer and  executes it for non-empty optional. It returns nothing
*/
