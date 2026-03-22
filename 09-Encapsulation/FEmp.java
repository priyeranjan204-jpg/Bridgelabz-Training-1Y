package com.gla.encapsulation;

class FEmp extends Emp {

    FEmp(int id, String n, double bs) {
        super(id, n, bs);
    }

    double calc() {
        return getBs();
    }
}