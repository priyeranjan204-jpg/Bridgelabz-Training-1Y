package com.gla.Exception;

public class Test1 {
    static {
        System.out.println("Hi I am a Static Block");
    }
    {
        System.out.println("Hi I am a Instance");
    }
    public Test1(){
        System.out.println("I am a Constructor");
    }
    public void m1()
    {
        System.out.println("This is a Method");
    }

    public static void main(String[] args) {
        System.out.println(" I am main method");
        Test1 t1=new Test1();
        t1.m1();

    }
}
