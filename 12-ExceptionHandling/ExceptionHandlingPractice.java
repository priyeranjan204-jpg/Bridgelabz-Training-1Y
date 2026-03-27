package com.gla.Exception;
import java.lang.Exception;

public class ExceptionHandlingPractice {

    public static void ageChecker(int age) throws ArithmeticException,NullPointerException {
        if (age < 18)
            throw new ArithmeticException("Invalid age");
        System.out.println("valid age");

        }
    public static void main(String[] args) {
        ageChecker(10);
        System.out.println();
    }
}

