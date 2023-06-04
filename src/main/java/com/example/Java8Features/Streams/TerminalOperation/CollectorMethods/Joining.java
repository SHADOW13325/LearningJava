package com.example.Java8Features.Streams.TerminalOperation.CollectorMethods;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author saumitra chauhan
 */
public class Joining {

    public static void main(String[] args) {

        String result = Stream.of("Saumitra", "Chauhan").collect(Collectors.joining());
        System.out.println("Simple Joining :" + result);

        result = Stream.of("Saumitra", "Chauhan").collect(Collectors.joining(" "));
        System.out.println("Joining with space delimiter :" + result);

        result = Stream.of("Saumitra", "Chauhan").collect(Collectors
                .joining(" ", "Mr. ", "!"));
        System.out.println("Joining with delimiter, prefix and suffix :" + result);

    }
}

/*
    It is used for concatenation of input elements mostly into a string. It has 3 overloaded methods.
        1. public static Collector<CharSequence, ?, String> joining()
        2. public static Collector<CharSequence, ?, String> joining(CharSequence delimiter)
        3. public static Collector<CharSequence, ?, String> joining(CharSequence delimiter, CharSequence prefix,
            CharSequence suffix)
*/