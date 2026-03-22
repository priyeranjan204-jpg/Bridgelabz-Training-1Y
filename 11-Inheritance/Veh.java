package com.gla.Inheritance;

class Veh {
    int sp;
    String f;

    Veh(int sp, String f) {
        this.sp = sp;
        this.f = f;
    }

    void info() {
        System.out.println(sp + " " + f);
    }
}
