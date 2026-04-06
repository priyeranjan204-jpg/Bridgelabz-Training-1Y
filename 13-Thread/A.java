package com.gla.Threads;

public class A extends Thread{

    public void run(){
        for(int i = 0;i < 9;i++){
            System.out.println("Priyeranjan");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
