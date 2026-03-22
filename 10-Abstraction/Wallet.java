package com.gla.Abstraction;

class Wallet implements Pay {
    public void pay(double amt) {
        System.out.println("Wallet paid " + amt);
    }
}