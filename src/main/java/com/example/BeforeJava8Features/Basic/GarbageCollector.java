package com.example.BeforeJava8Features.Basic;

/**
 * @author saumitra chauhan
 */
public class GarbageCollector {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        callFinalizeOnString();
        System.out.println();
        callFinalizeOnClass();
        Thread.sleep(1000);
        System.out.println();
        callGCItself();
    }

    @Override
    public void finalize(){
        System.out.println("finalize method called: " + ++count);
    }

    public static void callFinalizeOnString(){
        String s = new String("durga");
        s = null;
        System.gc();
        System.out.println("End of callFinalizeOnString");
    }

    public static void callFinalizeOnClass() throws InterruptedException {
        GarbageCollector garbageCollector = new GarbageCollector();
        garbageCollector = null;
        System.gc(); // runs on daemon thread
        Thread.sleep(1000);
        System.out.println("End of callFinalizeOnClass");
    }

    public static void callGCItself(){
        for (int i = 0; i < 10000000; i++){
            GarbageCollector garbageCollector = new GarbageCollector();
            garbageCollector = null;
        }
    }
}

/*
 callFinalizeOnClass method calls overridden finalize method as the gc is cleaning GarbageCollector object, but it is not
 true in the String, callFinalizeOnString method
*/
