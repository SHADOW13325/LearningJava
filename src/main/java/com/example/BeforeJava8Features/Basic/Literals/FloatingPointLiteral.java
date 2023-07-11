package com.example.BeforeJava8Features.Basic.Literals;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 21:01
 */

public class FloatingPointLiteral {

    public static void main(String[] args) {

//        Floating Point is must for floating point literal
        double v = 46.87;
        System.out.println(v);

//        It is not an octal as there is floating point
        double w = 0123.456;
        System.out.println(w);

//        malformed floating-point literal
//        double x = 0x123.456;

//        octal Integer to decimal double conversion
        double y = 0123;
        System.out.println(y);

//        hexa Integer to decimal double conversion
        double z = 0XFACE;
        System.out.println(z);
    }
}

/*
    Floating Point Literal includes float and double.
    For float it should be suffixed with f or F.
 */