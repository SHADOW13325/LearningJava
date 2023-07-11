package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 22:39
 */

public class PrimitiveDouble {

    public static void main(String[] args) {

        double a = 123.456;
        double b = 123.456f;


//        incompatible types: java.lang.String cannot be converted to float
//        float y = "abcd";

//        incompatible types: boolean cannot be converted to float
//        float z = true;
    }
}

/*
    double features:
        1. Size -> 8 byte (64 bits)
        2. Range -> [-1.7e308, 1.7e308]
        3. It is a double precision. Calculates decimal places accuracy upto 14-15 places.
        4. Default Value: 0.0
 */