package com.gla.Abstraction;

class UPI implements Pay {
    public void pay(double amt) {
        System.out.println("UPI paid " + amt);
    }
}
