package com.example.Collections.Generics;

import java.util.ArrayList;

public class WildCardCharacters {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<?> arrayList1 = new ArrayList<String>();
        ArrayList<?> arrayList2 = new ArrayList<Integer>();
        ArrayList<? extends Number> arrayList3 = new ArrayList<Integer>();
//        CE: Incompatible Types
//        ArrayList<? extends Number> arrayList4 = new ArrayList<String>();
        ArrayList<? super String> arrayList5 = new ArrayList<Object>();
//        CE : unexpectedType found: ? required : class or interface without bounds
//        ArrayList<?> arrayList6 = new ArrayList<?>();
//        CE : unexpectedType found: ? extends Number required : class or interface without bounds
//        ArrayList<?> arrayList7 = new ArrayList<? extends Number>();


//        At Runtime generic concept is not applicable. Compiler checks elements added of reference variable
//        types. Hence it adds element of any type.
        ArrayList l = new ArrayList<String>();
        l.add(10);
        l.add("saumitra");
        System.out.println(l.toString());

//        Here compiler checks elements whether they are string or not as per the reference type.
//        Hence we can add only string object.
        ArrayList<String> m = new ArrayList<String>();
        m.add("saumitra");
//        m.add(10);
        System.out.println(m.toString());
    }

//    CE: name clash : Both methods have same erasure. Since at compile time generic concept will be removed.
//    public void m1(ArrayList<String> l){}
    public void m1(ArrayList<Integer> l){}
}