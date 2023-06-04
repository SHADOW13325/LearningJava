package com.example.BeforeJava8Features.Modifiers.accessModifier.subpackages;
/**
    @author
    saumitra chauhan
*/

//import com.example.Modifiers.accessModifier.DefaultClass;
import com.example.BeforeJava8Features.Modifiers.accessModifier.PublicClass;

public class CallingClass {

    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        pc.test();
//        defaultClass dc = new defaultClass();
//        dc.test();
    }
}

// default class can't be called from subpackage