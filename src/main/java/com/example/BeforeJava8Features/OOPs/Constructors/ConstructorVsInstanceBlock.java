package com.example.BeforeJava8Features.OOPs.Constructors;
/**
    @author
    saumitra chauhan
*/

// Use of Instance Block example -> If we want to keep track on how many objects are created

class WithoutInstanceBlock {

    static int count = 0;

    WithoutInstanceBlock(){
        count++;
    }

    WithoutInstanceBlock(int i){
        count++;
    }

    WithoutInstanceBlock(double d){
        count++;
    }

    public static void main(String[] args) {

        WithoutInstanceBlock withoutInstanceBlock = new WithoutInstanceBlock();
        withoutInstanceBlock = new WithoutInstanceBlock(10);
        withoutInstanceBlock = new WithoutInstanceBlock(10.5);
        System.out.println("Total Objects : " + count);
    }

}

class WithInstanceBlock {

    static int count = 0;

    {
        count++;
    }

    WithInstanceBlock(){}

    WithInstanceBlock(int i){}

    WithInstanceBlock(double d){}

    public static void main(String[] args) {

        WithInstanceBlock withInstanceBlock = new WithInstanceBlock();
        withInstanceBlock = new WithInstanceBlock(10);
        withInstanceBlock = new WithInstanceBlock(10.5);
        System.out.println("Total Objects : " + count);
    }
}

// Using instance blocks redundant lines of code gets reduced.