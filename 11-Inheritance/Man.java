package com.gla.Inheritance;

class Man extends Emp {
    int t;

    Man(String n, int id, double s, int t) {
        super(n, id, s);
        this.t = t;
    }

    void show() {
        super.show();
        System.out.println("Team: " + t);
    }
}
