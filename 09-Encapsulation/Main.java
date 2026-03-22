package com.gla.encapsulation;

public class Main {
    public static void main(String[] args) {

        Veh v1 = new Car("UP01", 1000);
        Veh v2 = new Bike("UP02", 500);
        Veh v3 = new Truck("UP03", 2000);

        System.out.println(v1.rent(2));
        System.out.println(((Car)v1).ins());

        System.out.println(v2.rent(2));
        System.out.println(v3.rent(2));
    }
}
