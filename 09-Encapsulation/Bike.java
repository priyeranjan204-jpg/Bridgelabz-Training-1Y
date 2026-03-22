package com.gla.encapsulation;

class Bike extends Veh {

    Bike(String no, double r) {
        super(no, r);
    }

    double rent(int d) {
        return getR() * d;
    }
}
