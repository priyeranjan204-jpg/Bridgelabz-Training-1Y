package com.gla.encapsulation;

class Cloth extends Prod {

    Cloth(int id, String n, double p) {
        super(id, n, p);
    }

    double disc() {
        return getP() * 0.2;
    }
}
