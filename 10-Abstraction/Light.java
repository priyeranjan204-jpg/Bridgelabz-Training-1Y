package com.gla.Abstraction;

class Light implements Device {
    public void on() {
        System.out.println("Light On");
    }

    public void off() {
        System.out.println("Light Off");
    }
}
