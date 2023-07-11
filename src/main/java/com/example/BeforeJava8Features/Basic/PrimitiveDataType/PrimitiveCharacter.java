package com.example.BeforeJava8Features.Basic.PrimitiveDataType;

/**
 * @author saumitra chauhan
 * @since 09-07-2023 19:29
 */

public class PrimitiveCharacter {

    public static void main(String[] args) {

        char u = 'a';

//        cannot find symbol    symbol:   variable a
//        char v = a;

//        incompatible types: java.lang.String cannot be converted to char
//        char w = "a";

//        unclosed character literal -> opening apostrophe
//        unclosed character literal -> closing apostrophe
//        not a statement
//        char x = 'ab';

        char y = 65535;

//        incompatible types: possible lossy conversion from int to char
//        char z = 65536;

//        incompatible types: possible lossy conversion from double to char
//        char a = 10.5;

//        incompatible types: boolean cannot be converted to char
//        char b = true;

        char c = 0xFACE; // HEXA literal to char

        char d = '\uFACE'; // unicode literal

        char e = '\u0061'; // character 'a'

        char f = '\n'; // escape character

//        illegal escape character
//        char g = '\a';
    }
}

/*
    char Features :
        1. Size -> 2 bytes (16 bits)
        2. Range -> [0, 65535]
        3. These range numbers might not have any font associated with it or the current machine
            doesn't have font associated with it.
        4. Default Value: 0 (Space character)
        5. There is a unicode representation. Format is : '\uAAAA'. Here AAAA are 4 characters in hexa form.
        6. We can assign escape characters also as they are treated as characters.
            There are 8 of them -> \n , \t , \' , \" , \\ , \r , \b , \f .
 */