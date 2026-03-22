package com.gla.Inheritance;

public class Main {
        public static void main(String[] args) {

            Emp e1 = new Man("A", 1, 50000, 5);
            Emp e2 = new Dev("B", 2, 40000, "Java");
            Emp e3 = new Intn("C", 3, 10000);

            e1.show();
            e2.show();
            e3.show();
        }
    }

