package com.example.BeforeJava8Features.ExceptionHandling;

/**
 * @author saumitra chauhan
 */
public class ExceptionPrinting {

    public static void main(String[] args) {

        System.out.println("start");

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e){

            System.out.println("Description of the Exception Printed");
            System.out.println(e.getMessage());
            System.out.println("Name and Description of the Exception Printed");
            System.out.println(e.toString()); // e == e.toString() for printing part as sout(e) calls e.toString() internally
            System.out.println("Full Info Printed. Name, Description and Location of the Exception");
            e.printStackTrace();
        }

        System.out.println("end");
    }
}

// stackTrace is always printed at the last