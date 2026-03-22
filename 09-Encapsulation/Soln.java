package com.gla.encapsulation;

public class Soln {
    public static void main(String[] args) {

        Prod p1 = new Elec(1, "TV", 20000);
        Prod p2 = new Cloth(2, "Shirt", 1000);

        double f1 = p1.getP() + ((Elec)p1).tax() - p1.disc();
        double f2 = p2.getP() - p2.disc();

        System.out.println(f1);
        System.out.println(f2);
    }
}
