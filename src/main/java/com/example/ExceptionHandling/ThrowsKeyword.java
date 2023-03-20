package com.example.ExceptionHandling;

public class ThrowsKeyword {

//    can't use throws keyword in instance block
    {
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            throw new RuntimeException("Hello Saumitra");
        }
    }

    public static void main(String[] args) {
        System.out.println("object creation");
//        ThrowsKeyword throwsKeyword = new ThrowsKeyword();
        System.out.println("object created");

        try {
            doSomething();
            doEverything();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void doSomething() throws InterruptedException {
        System.out.println("In doSomething method");
        Thread.sleep(1000);
    }

    public static void doEverything(){
        System.out.println("In doEverything method");
//        doEverythingElse();
    }

    public static void doEverythingElse() throws InterruptedException {
        System.out.println("In doEverythingElse method");
        Thread.sleep(1000);
    }
}

//  If a method throws a checked exception than we have either to delegate it to just parent method or catch it.

class TryCatchWithCheckedException {
    public static void main(String[] args) {
        partiallyCheckedExceptionWithTry();
        fullyCheckedExceptionWithTry();
        uncheckedExceptionWithTry();
    }

    public static void partiallyCheckedExceptionWithTry() {
        try {
            System.out.println("In partiallyCheckedExceptionWithTry method");
        } catch (Exception e){
            System.out.println("Caught partially checked exception");
        }
    }

    public static void fullyCheckedExceptionWithTry() {
//        try {
//            System.out.println("In fullyCheckedExceptionWithTry method");
//        } catch (InterruptedException e){
//            System.out.println("Caught fully checked exception");
//        }
    }

    public static void uncheckedExceptionWithTry() {
        try {
            System.out.println("in uncheckedExceptionWithTry method");
        } catch (Error e){
            System.out.println("Caught unchecked Exception Error");
        }
    }
}

class ThrowsWithCheckedException {
    public static void main(String[] args) {
        try {
            throwsCheckedException();
        } catch (InterruptedException e) {
            System.out.println("Catch Fully Checked Exception with No Compile time exception");
        }
    }

    public static void throwsCheckedException() throws InterruptedException{
        System.out.println("Throwing Checked Exception as method signature");
    }
}

// When using try catch if compiler didn't find any way a fully checked exception can be thrown
// in try block and you try to catch in the catch block compiler will throw
// CE saying exception xxx never thrown in the body of corresponding try statement but
// if we use throws keyword instead of try catch then no CE
//
// throws keyword can only throw throwable objects
// throws keyword can be used with constructors and methods but not with static and instance block