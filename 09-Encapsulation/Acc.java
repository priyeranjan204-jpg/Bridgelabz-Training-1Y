package com.gla.encapsulation;

abstract class Acc {
    private int no;
    private String n;
    private double b;

    Acc(int no, String n, double b) {
        this.no = no;
        this.n = n;
        this.b = b;
    }

    public double getB() { return b; }

    public void dep(double a) {
        b += a;
    }

    public void wd(double a) {
        b -= a;
    }

    abstract double intr();
}
