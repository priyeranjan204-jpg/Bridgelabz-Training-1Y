package com.gla.Threads;

public class Runner1 {
   public static void main(String[] args) {
        B t1 = new B();
        A t2 = new A();

        t2.start();
        t1.start();
    }
}
