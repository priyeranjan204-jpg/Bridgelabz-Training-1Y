package com.gla.Inheritance;

public class Ship extends Order {
        String t;

        Ship(int id, String d, String t) {
            super(id, d);
            this.t = t;
        }

        String status() {
            return "Shipped";
        }
    }

