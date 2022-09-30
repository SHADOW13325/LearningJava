package com.example.Modifiers.Imports;
/*
    @author
    saumitra chauhan
*/

import static java.lang.System.out;

public class StaticImport {
    static int MAX_VALUE = 990;
    public static void main(String[] args) {
        System.out.println(MAX_VALUE);
        out.println("without System");
        Test test = new Test();
        test.call();
    }
}
// 1st precedence in static import is static variable of class, then explicit import,
// then cwd, and then implicit import