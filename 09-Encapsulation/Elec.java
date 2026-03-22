package com.gla.encapsulation;

class Elec extends Prod implements Tax {

    Elec(int id, String n, double p) {
        super(id, n, p);
    }

    double disc() {
        return getP() * 0.1;
    }

    public double tax() {
        return getP() * 0.18;
    }
}
