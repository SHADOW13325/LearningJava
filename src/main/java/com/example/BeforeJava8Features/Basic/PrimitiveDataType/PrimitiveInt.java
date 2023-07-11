package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 07-07-2023 12:44
 */

public class PrimitiveInt {

    public static void main(String[] args) {

        int u = 2147483647;

//        integer number too large
//        int a = 2147483648;

//        incompatible types: possible lossy conversion from long to int
//        int v = 2147483648L;

        int w = -2147483648;

//        incompatible types: possible lossy conversion from double to int
//        int x = 10.5;

//        incompatible types: java.lang.String cannot be converted to int
//        int y = "abcd";

//        incompatible types: boolean cannot be converted to int
//        int z = true;
    }
}

/*
    int features:
        1. Size -> 4 bytes (32 bits)
        2. Range -> [-2147483648, 2147483647] or [-2power31, 2power31 - 1]
        3. Memory rep :-
            a) Direct rep for +ve numbers
            b) 2's complement rep for -ve numbers
        4. Most common integral data type in java
        5. Default Value: 0
 */