package com.example.OOPs.Constructors;/*
    @author
    saumitra chauhan
*/

// Default Constructor
class ParentArgConstructor1 {

}

class ChildClass1 extends ParentArgConstructor1{

}

// No-Arg Constructor
class ParentArgConstructor2 {

    ParentArgConstructor2(){

    }
}

class ChildClass2 extends ParentArgConstructor2{

}

// 1-Arg Constructor
class ParentArgConstructor3 {

//    No default constructor available
//    ParentArgConstructor3(int i) {
//
//    }
}

class ChildClass3 extends ParentArgConstructor3{

}

// If parent class contains arg constructor then while writing child classes we have to take special
// care wrt constructors
// Whenever we are writing any arg constructor it is highly recommended to write no-arg constructor also