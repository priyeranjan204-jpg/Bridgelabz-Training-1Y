package com.gla.encapsulation;

public class Sol {
    public static void main(String[] args) {

        Emp e1 = new FEmp(1, "A", 50000);
        Emp e2 = new PEmp(2, "B", 5, 200);

        e1.show();
        e2.show();
    }
}
