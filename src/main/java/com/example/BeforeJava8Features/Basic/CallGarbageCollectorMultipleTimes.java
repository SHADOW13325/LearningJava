package com.example.BeforeJava8Features.Basic;

public class CallGarbageCollectorMultipleTimes {

    static CallGarbageCollectorMultipleTimes gc;

    public static void main(String[] args) throws InterruptedException {
        CallGarbageCollectorMultipleTimes garbageCollector = new CallGarbageCollectorMultipleTimes();
        System.out.println(garbageCollector.hashCode());
        garbageCollector = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(gc.hashCode());
        gc = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println("End of the method");
    }

    @Override
    public void finalize(){
        System.out.println("Finalize method called");
        gc = this;
    }
}

// Even though object eligible for gc multiple times, but gc calls finalize method only once