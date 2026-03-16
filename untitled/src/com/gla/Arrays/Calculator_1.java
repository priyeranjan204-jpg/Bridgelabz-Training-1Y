package com.gla.Arrays;

import java.util.*;

public class Calculator_1 {


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
            Calculator_1 c1 = new Calculator_1();

            while (true) {
                System.out.println("welcome to Priyeranjan's Calculator");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();

                if (choice == 5) {
                    System.out.println("Calculator Closed.");
                    break;
                }

                System.out.print("Enter First Number: ");
                int a = sc.nextInt();
                System.out.print("Enter Second Number: ");
                int b = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Result = " + c1.add(a, b));
                        break;
                    case 2:
                        System.out.println("Result = " + c1.sub(a, b));
                        break;
                    case 3:
                        System.out.println("Result = " + c1.mul(a, b));
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println("Result = " + c1.div(a, b));
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                    default:
                        System.out.println("Invalid Choice!");
                }
            }
        }
    }


