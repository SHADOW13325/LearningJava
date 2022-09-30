package com.example.Collections.Concurrent;
/*
    @author
    saumitra chauhan
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NeedforConcurrent extends Thread{

    static List<String> threadList = new ArrayList();

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("child thrad updating list");
        threadList.add("D");
    }

    public static void main(String[] args) throws InterruptedException {
        threadList.add("A");
        threadList.add("B");
        threadList.add("C");

        NeedforConcurrent t = new NeedforConcurrent();
        t.start();

        Iterator itr = threadList.iterator();

        while (itr.hasNext()) {
            String s = (String) itr.next();
            System.out.println("main thread iterating list and current object is: " + s);
            Thread.sleep(3000);
        }

        System.out.println(threadList);
    }
}
