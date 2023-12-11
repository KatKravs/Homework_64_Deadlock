package ait.deadlock;

import ait.deadlock.class1.Class1;

public class gitAppl {
    public static void main(String[] args) {
        Class1 []class1 = new Class1[2];
        for (int i = 0; i < class1.length ; i++) {
            class1[i] = new Class1();

        }
        Thread[]threads = new Thread[2];
        for (int i = 0; i < threads.length ; i++) {
            threads[i] = new Thread(class1[i]);

        }
        for (int i = 0; i < threads.length ; i++) {
            threads[i].start();
        }


    }
}
