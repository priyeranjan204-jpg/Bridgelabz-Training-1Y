package com.gla.Inheritance;

public  class Book {
    String t;
    int y;

    Book(String t, int y) {
        this.t = t;
        this.y = y;
    }

    void show() {
        System.out.println("Title: " + t);
        System.out.println("Year: " + y);
    }
}

