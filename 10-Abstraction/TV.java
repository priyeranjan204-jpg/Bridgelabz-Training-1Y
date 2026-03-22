package com.gla.Abstraction;

class TV implements Device {
    public void on() {
        System.out.println("TV On");
    }

    public void off() {
        System.out.println("TV Off");
    }
}