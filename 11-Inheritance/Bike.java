package com.gla.Inheritance;

class Bike extends Veh {

    Bike(int sp, String f) {
        super(sp, f);
    }

    void info() {
        super.info();
        System.out.println("Bike");
    }
}
