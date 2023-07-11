package com.example.BeforeJava8Features.Basic.Arrays;

/**
 * @author saumitra chauhan
 * @since 10-07-2023 23:38
 */

public class ArrayTypes {

    public static void main(String[] args) {

//        primitive Arrays
        int[] intArray = new int[]{10, 20};
        char[] charArray = new char[]{'a','b'};

//        incompatible types: char[] cannot be converted to int[]
//        intArray = charArray;


//        Object Type Arrays
        String[] stringArray = new String[]{"abc", "def"};
        Object[] objectArray = stringArray; // interconversion allowed


//        Abstract class Type Arrays
        Parent[] abstractClassArray = new Parent[1];
        abstractClassArray[0] = new Child();
        Child[] childClassArray = new Child[5];
        abstractClassArray = childClassArray; // interconversion allowed


//        Interface Type Arrays
        Interf[] interfaceArray = new Interf[1];
        interfaceArray[0] = new Child();
        interfaceArray = childClassArray; // interconversion allowed



    }
}

abstract class Parent{

}

interface Interf {

}

class Child extends Parent implements Interf{

}

// Interconversion between primitive arrays is not allowed but for object type arrays allowed.