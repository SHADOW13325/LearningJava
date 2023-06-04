package com.example.BeforeJava8Features.OOPs.ControlFlow.StaticControl;
/**
    @author
    saumitra chauhan
*/

class DirectReadBeforeAssign {

    static {
        System.out.println("In DirectReadBeforeAssign");

// If a variable is in Read Indirect Write Only state, we can't perform direct read but can perform indirect read.
// If we read directly, it will give Compile-time error "illegal forward reference"
//        System.out.println(x);
    }

    public static void main(String[] args) {

    }

    static int x = 10;
}

class DirectReadAfterAssign {

    static int x = 10;

    static {
        System.out.println("In DirectReadAfterAssign");
        System.out.println(x);
    }

    public static void main(String[] args) {

    }
}

class IndirectRead {

    static {
        main(null);
    }

    public static void main(String[] args) {
        System.out.println("In Main Method");
        System.out.println(x);
    }

    static int x = 10;

}

// Inside the static block if we are trying to read variable, that read operation is called direct read.
// If we are calling a method and within that method we are trying to read a variable, that read operation is called Indirect Read.
