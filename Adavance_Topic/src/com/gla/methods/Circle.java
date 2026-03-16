package com.gla.methods;

public class Circle {
    //Area of a circle
    //Circum of a circle
    public void areaOfCircle(int radius) {
        System.out.println("Area of a circle:- ");
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(area);

        System.out.println("Circumference of a circle:- ");
        double circu = 2 * Math.PI * radius;
        System.out.println(circu);
    }
}
