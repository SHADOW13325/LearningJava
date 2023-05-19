package com.example.Java8Features.FunctionalInterface.PredefinedFunctionalInterfaces.NonPrimitiveFunctionalInterfaces.SingleArgument;
/**
 * @author saumitra chauhan
 */

import java.util.Date;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {

    public static void main(String[] args) {

        Supplier<Date> currentDate = () -> new Date();
        System.out.println(currentDate.get());

        currentDate = SupplierFunctionalInterface::methodReference;
        System.out.println(currentDate.get());
    }

    public static Date methodReference() {
        return new Date();
    }
}

/*
  It is a predefined functional Interface which only gives an output and doesn't take an input.
  We can also use method reference but the method should override the get() method properly.
  E.g. checking parameters and return types
*/
