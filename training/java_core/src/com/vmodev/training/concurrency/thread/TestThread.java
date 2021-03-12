package com.vmodev.training.concurrency.thread;

public class TestThread {
    public static void main(String args[]) {
        DemoThread T1 = new DemoThread("Thread-1");
        T1.start();
        DemoThread T2 = new DemoThread("Thread-2");
        T2.start();
    }
}
