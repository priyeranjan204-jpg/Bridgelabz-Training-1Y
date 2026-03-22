package com.gla.encapsulation;

class PEmp extends Emp {
    private int h;
    private double r;

    PEmp(int id, String n, int h, double r) {
        super(id, n, 0);
        this.h = h;
        this.r = r;
    }

    double calc() {
        return h * r;
    }
}
