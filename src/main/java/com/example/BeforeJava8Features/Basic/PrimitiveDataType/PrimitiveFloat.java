package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 22:31
 */

public class PrimitiveFloat {

    public static void main(String[] args) {

        float a = 123.456f;

        float b = 20l;

        float c = 'a';

//        incompatible types: possible lossy conversion from double to float
//        float d = 123.456;

//        incompatible types: java.lang.String cannot be converted to float
//        float y = "abcd";

//        incompatible types: boolean cannot be converted to float
//        float z = true;
    }
}

/*
    float features:
        1. Size -> 4 byte (32 bits)
        2. Range -> [-3.4e38, 3.4e38]
        3. It is a single precision. Calculates decimal places accuracy upto 5-6 places.
        4. It must be suffixed with 'f' or 'F' while initialising
        5. Default Value: 0.0
 */