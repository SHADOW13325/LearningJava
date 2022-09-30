package com.example.Collections.Concurrent;
/*
    @author
    saumitra chauhan
*/

import java.util.Iterator;
import java.util.List;

public class CopyOnWriteArrayList extends Thread{

    static List<String> threadList = new java.util.concurrent.CopyOnWriteArrayList<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Child Thread Updating List");
        threadList.add("C");
    }

    public static void main(String[] args) throws InterruptedException {
        threadList.add("A");
        threadList.add("B");
        threadList.add("D");

        CopyOnWriteArrayList t = new CopyOnWriteArrayList();
        t.start();

//      Any Modification after defining iterator in the list won't be reflected in the iterator
        Iterator itr = threadList.iterator();
        threadList.add("E");

        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println("Main Thread Iterating List and Current Object is: " + o.toString());

//            If we replace copyOnWriteArrayList with ArrayList we won't get UnsupportedOperationException
//            if (o.toString().equals("D")) {
//                itr.remove();
//            }

            Thread.sleep(3000);
        }

        System.out.println(threadList);
    }
}
