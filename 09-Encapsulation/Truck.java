package com.gla.encapsulation;
 class Truck extends Veh {

    Truck(String no, double r) {
        super(no, r);
    }

    double rent(int d) {
        return getR() * d * 2;
    }
}

