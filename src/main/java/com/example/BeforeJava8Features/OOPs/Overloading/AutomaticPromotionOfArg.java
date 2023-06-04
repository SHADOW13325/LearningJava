package com.example.BeforeJava8Features.OOPs.Overloading;
/**
    @author
    saumitra chauhan
*/

public class AutomaticPromotionOfArg {

    public static void main(String[] args) {
        Test1 test = new Test1();
        test.m1(5);
        test.m1("hello friend");
        test.m1('a'); // datatype is promoted and checked whether now exact method match is found or not
    }

}

class Test1 {
     public void m1(int i){
         System.out.println("int version");
     }

     public void m1(String s){
         System.out.println("string version");
     }
}
