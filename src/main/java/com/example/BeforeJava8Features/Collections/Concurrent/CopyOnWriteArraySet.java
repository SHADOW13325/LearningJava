package com.example.BeforeJava8Features.Collections.Concurrent;
/**
    @author
    saumitra chauhan
*/

import java.util.Iterator;
import java.util.Set;

public class CopyOnWriteArraySet extends Thread{

    static Set<String> threadList = new java.util.concurrent.CopyOnWriteArraySet<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child Thread Updating set");
        threadList.add("C");
    }

    public static void main(String[] args) throws InterruptedException {
        threadList.add("A");
        threadList.add("B");
        threadList.add("D");

        CopyOnWriteArraySet t = new CopyOnWriteArraySet();
        t.start();

//      Any Modification after defining iterator in the list won't be reflected in the iterator
        Iterator itr = threadList.iterator();
        threadList.add("E");

        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println("Main Thread Iterating Set and Current Object is: " + o.toString());

//            If we replace copyOnWriteArrayList with ArrayList we won't get UnsupportedOperationException
//            if (o.toString().equals("D")) {
//                itr.remove();
//            }

            Thread.sleep(3000);
        }

        System.out.println(threadList);
    }
}

/*
 On update operation, CopyOnWriteArraySet creates a cloned copy of underlying and
 at a certain point both will be synchronized automatically
 Here insertion order is preserved
*/