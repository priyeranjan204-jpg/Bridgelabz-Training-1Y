package com.gla.encapsulation;

abstract class Emp {
    private int id;
    private String n;
    private double bs;

    Emp(int id, String n, double bs) {
        this.id = id;
        this.n = n;
        this.bs = bs;
    }

    public int getId() { return id; }
    public String getN() { return n; }
    public double getBs() { return bs; }

    abstract double calc();

    void show() {
        System.out.println(id + " " + n + " " + calc());
    }
}