package com.example.Collections.Concurrent;
/*
    @author
    saumitra chauhan
*/

import java.util.Iterator;
import java.util.Map;

public class ConcurrentHashMap extends Thread{

    static Map<Integer, String> threadList = new java.util.concurrent.ConcurrentHashMap<>();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child thrad updating Map");
        threadList.put(101,"A");
    }

    public static void main(String[] args) throws InterruptedException {
        threadList.put(104,"D");
        threadList.put(102,"B");
        threadList.put(103,"C");

        ConcurrentHashMap t = new ConcurrentHashMap();
        t.start();

        Iterator itr = threadList.entrySet().iterator();
        threadList.put(105,"E");

        while (itr.hasNext()) {
            Object o = itr.next();
            System.out.println("main thread iterating map and current object is: " + o.toString());
            Thread.sleep(1000);
        }

        System.out.println(threadList);
    }
}
