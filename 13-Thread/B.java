package com.gla.Threads;

public class B extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Singh");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}