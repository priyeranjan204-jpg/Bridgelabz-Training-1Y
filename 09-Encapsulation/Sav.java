package com.gla.encapsulation;

class Sav extends Acc implements Loan {

    Sav(int no, String n, double b) {
        super(no, n, b);
    }

    double intr() {
        return getB() * 0.05;
    }

    public void apply() {
        System.out.println("Loan applied");
    }

    public boolean check(double amt) {
        return amt < getB() * 2;
    }
}