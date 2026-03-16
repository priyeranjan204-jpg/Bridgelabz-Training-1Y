package com.gla.Arrays;

import java.util.Scanner;

public class Calculator {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number:");
        int b = sc.nextInt();
        Calculator c1 = new Calculator();
        int addition = c1.add(a,b);
        System.out.println("Addition of Two Number is: " + addition);
        int subtraction = c1.sub(a,b);
        System.out.println("Subtraction of Two Number is: " + subtraction);
        int multiplication = c1.mul(a,b);
        System.out.println("Multiplication of Two Number is: " + multiplication);
        int division = c1.div(a,b);
        System.out.println("Division of Two Number is: " + division);
    }
}