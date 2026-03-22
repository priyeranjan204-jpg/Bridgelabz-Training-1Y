package com.gla.Abstraction;

class Card implements Pay {
    public void pay(double amt) {
        System.out.println("Card paid " + amt);
    }
}
