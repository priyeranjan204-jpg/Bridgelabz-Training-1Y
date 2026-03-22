package com.gla.encapsulation;

class Car extends Veh implements Ins {

    Car(String no, double r) {
        super(no, r);
    }

    double rent(int d) {
        return getR() * d;
    }

    public double ins() {
        return 500;
    }
}
