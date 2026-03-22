package com.gla.encapsulation;

public class Solution {
    public static void main(String[] args) {

        Acc a1 = new Sav(1, "A", 10000);
        Acc a2 = new Cur(2, "B", 20000);

        System.out.println(a1.intr());
        System.out.println(a2.intr());

        ((Sav)a1).apply();
        System.out.println(((Sav)a1).check(15000));
    }
}
