package com.gla.Inheritance;

class Dev extends Emp {
    String l;

    Dev(String n, int id, double s, String l) {
        super(n, id, s);
        this.l = l;
    }

    void show() {
        super.show();
        System.out.println("Lang: " + l);
    }
}
