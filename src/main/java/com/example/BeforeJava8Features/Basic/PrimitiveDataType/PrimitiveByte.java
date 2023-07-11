package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 07-07-2023 12:25
 */
public class PrimitiveByte {

    public static void main(String[] args) {

        byte u = 127;

//        incompatible types: possible lossy conversion from int to byte
//        byte v = 128;

        byte w = -128;

//        incompatible types: possible lossy conversion from double to byte
//        byte x = 10.5;

//        incompatible types: java.lang.String cannot be converted to byte
//        byte y = "abcd";

//        incompatible types: boolean cannot be converted to byte
//        byte z = true;
    }
}

/*
    byte features:
        1. Size -> 1 byte (8 bits)
        2. Range -> [-128, 127]
        3. Memory rep :-
            a) Direct rep for +ve numbers
            b) 2's complement rep for -ve numbers
        4. Best Choice for handling data in terms from streams either from file or network
        5. Default Value: 0
 */