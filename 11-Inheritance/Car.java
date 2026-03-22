package com.gla.Inheritance;

class Car extends Veh {
    int s;

    Car(int sp, String f, int s) {
        super(sp, f);
        this.s = s;
    }

    void info() {
        super.info();
        System.out.println("Seat: " + s);
    }
}
