package com.example.BeforeJava8Features.Modifiers.Imports;

 /**
    @author
    saumitra chauhan
 */

import static com.example.BeforeJava8Features.Modifiers.Imports.StaticImport.MAX_VALUE;

public class StaticImportTest {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(4));

    }

    public void call () {
        System.out.println(MAX_VALUE);
    }
}
