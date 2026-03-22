package com.gla.Inheritance;

public class Order {
        int id;
        String d;

        Order(int id, String d) {
            this.id = id;
            this.d = d;
        }

        String status() {
            return "Order Placed";
        }
    }

