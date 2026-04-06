package com.gla.Threads;

public class Runner {
    public static void main(String[] args) {

        MyThread1 t1=new MyThread1();

        Thread t=new Thread(t1);

        t.start();

        MyThread2 t2=new MyThread2();
        t2.start();
    }
}