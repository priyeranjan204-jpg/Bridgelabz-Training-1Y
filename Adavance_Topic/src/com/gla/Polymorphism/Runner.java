package com.gla.Polymorphism;

public class Runner {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int Sum1 = c1.add(11,12);
        System.out.println("Sum of Integer " + Sum1);
        double Sum2 = c1.add(111.222,222.333);
        System.out.println("Sum of Double " + Sum2);
    }
}
