package com.example.BeforeJava8Features.Basic.Literals;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 20:45
 */

public class IntegralLiteral {

    public static void main(String[] args) {

        // Decimal Literal
        int w = 456;
        System.out.println("Decimal Literal : " + w);

        // Octal Literal
        int x = 0345;
        System.out.println("Octal Literal : " + x);

        // Hexa Literal
        int y = 0xFACE;
        System.out.println("Hexa Literal : " + y);

        // Binary Literal . It came in 1.7v
        int z = 0b10100101;
        System.out.println("Binary Literal : " + z);

    }
}

/*
    Integral literal includes byte, short, int and long. For long it should be suffixed with l or L.
    1. Decimal Literal
        a) Range : [0-9] base_10
        b) prefix : None
    2. Octal Literal
        a) Range : [0-7] base_8
        b) prefix : 0
    3. HexaDecimal Literal
        a) Range : [0-9,A-F or a-f] base_16
        b) prefix : 0x or 0X
    4. Binary Literal (1.7v)
        a) Range : [0,1] base_2
        b) prefix : 0b or 0B
 */