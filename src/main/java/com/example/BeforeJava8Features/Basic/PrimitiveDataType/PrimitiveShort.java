package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 07-07-2023 12:35
 */

public class PrimitiveShort {

    public static void main(String[] args) {

        short u = 32767;

//        incompatible types: possible lossy conversion from int to short
//        short v = 32768;

        short w = -32768;

//        incompatible types: possible lossy conversion from double to short
//        short x = 10.5;

//        incompatible types: java.lang.String cannot be converted to short
//        short y = "abcd";

//        incompatible types: boolean cannot be converted to short
//        short z = true;
    }
}

/*
    short features:
        1. Size -> 2 bytes (16 bits)
        2. Range -> [-32768, 32767] or [-2power15, 2power15 - 1]
        3. Memory rep :-
            a) Direct rep for +ve numbers
            b) 2's complement rep for -ve numbers
        4. Best Choice for 16 bit processors like 8085 but completely outdated now
        5. Default Value: 0
 */