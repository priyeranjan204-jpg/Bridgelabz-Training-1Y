package com.gla.encapsulation;

abstract class Veh {
    private String no;
    private double r;

    Veh(String no, double r) {
        this.no = no;
        this.r = r;
    }

    public double getR() { return r; }

    abstract double rent(int d);
}
