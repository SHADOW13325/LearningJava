package com.example.BeforeJava8Features.Collections.Enums;

/**
 * @author saumitra chauhan
 */
public enum EnumMethods {

    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC;

    public static void valuesAndOrdinalMethods(){
        EnumMethods[] enumMethods = EnumMethods.values();
        for (EnumMethods enumMethod : enumMethods){
            System.out.println(enumMethod);
            System.out.println(enumMethod.ordinal());
        }
    }

    public static void main(String[] args) {
        EnumMethods.valuesAndOrdinalMethods();
    }

}
