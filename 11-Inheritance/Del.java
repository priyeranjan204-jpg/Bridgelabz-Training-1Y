package com.gla.Inheritance;

public class Del extends Ship {
    String dd;

    Del(int id, String d, String t, String dd) {
        super(id, d, t);
        this.dd = dd;
    }

    String status() {
        return "Delivered";
    }
}
