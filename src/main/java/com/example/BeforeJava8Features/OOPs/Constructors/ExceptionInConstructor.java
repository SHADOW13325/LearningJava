package com.example.BeforeJava8Features.OOPs.Constructors;
/**
    @author
    saumitra chauhan
*/

import java.io.IOException;

class ParentWithException {

    ParentWithException() throws IOException {}

}

//class ChildWithoutException extends ParentWithException{
//
//    ChildWithoutException() {
//
//    }
//}

class ChildWithException extends ParentWithException{

    ChildWithException() throws IOException {

    }
}

/*
 If parent class constructor throws any checked exception, compulsory child class constructor
 should throw the same checked exception or its parent otherwise compile time error "Unreported exception"
 We can't write super() in try-catch block as first line in constructor must be super() or this()
*/
