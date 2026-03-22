package com.gla.Inheritance;

class Truck extends Veh {
    int l;

    Truck(int sp, String f, int l) {
        super(sp, f);
        this.l = l;
    }

    void info() {
        super.info();
        System.out.println("Load: " + l);
    }
}