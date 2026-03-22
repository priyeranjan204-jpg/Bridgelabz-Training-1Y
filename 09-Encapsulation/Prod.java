package com.gla.encapsulation;

abstract class Prod {
    private int id;
    private String n;
    private double p;

    Prod(int id, String n, double p) {
        this.id = id;
        this.n = n;
        this.p = p;
    }

    public double getP() { return p; }

    abstract double disc();
}