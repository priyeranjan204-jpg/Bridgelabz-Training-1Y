package com.gla.Inheritance;

class Author extends Book {
    String n;
    String b;

    Author(String t, int y, String n, String b) {
        super(t, y);
        this.n = n;
        this.b = b;
    }

    void show() {
        super.show();
        System.out.println("Author: " + n);
        System.out.println("Bio: " + b);
    }
}
