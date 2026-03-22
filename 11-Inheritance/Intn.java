package com.gla.Inheritance;

class Intn extends Emp {

    Intn(String n, int id, double s) {
        super(n, id, s);
    }

    void show() {
        super.show();
        System.out.println("Intern");
    }
}
