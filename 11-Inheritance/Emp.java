package com.gla.Inheritance;

class Emp {
    String n;
    int id;
    double s;

    Emp(String n, int id, double s) {
        this.n = n;
        this.id = id;
        this.s = s;
    }

    void show() {
        System.out.println(n + " " + id + " " + s);
    }
}
