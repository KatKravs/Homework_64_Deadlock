package ait.deadlock.class1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class Class1 implements Runnable{
    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();

    public void run() {
        synchronized (lock1) {
            synchronized (lock2) {
                System.out.println("Hello from Class1");

            }
        }
    }

}
