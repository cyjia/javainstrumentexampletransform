package com.baiju.java.instrument.example.transform;

public class Sleeping {
    public void ransomSleep() throws InterruptedException {
        long t = (long) (500 + Math.random() * 1000);
        System.out.printf("Sleeping for %d ms ...\n", t);
        Thread.sleep(t);
    }
}
