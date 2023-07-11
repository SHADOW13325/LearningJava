package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 07-07-2023 12:58
 */

public class PrimitiveLong {

    public static void main(String[] args) {

        long u = 9223372036854775807l;

//        Long number too large
//        long v = 9223372036854775808l;

        long w = -9223372036854775808l;

//        incompatible types: possible lossy conversion from double to long
//        long x = 10.5;

//        incompatible types: java.lang.String cannot be converted to long
//        long y = "abcd";

//        incompatible types: boolean cannot be converted to long
//        long z = true;
    }
}

/*
    long features:
        1. Size -> 8 bytes (64 bits)
        2. Range -> [-9223372036854775808, 9223372036854775807] or [-2power63, 2power63 - 1]
        3. Memory rep :-
            a) Direct rep for +ve numbers
            b) 2's complement rep for -ve numbers
        4. It must be suffixed with 'l' or 'L' while initialising
        5. Default Value: 0
 */