package com.gla.Exception;
import java.lang.Exception;

public class Test {

    public static void aithmeticException()
    {
        try {
            int a = 10;
            int b = 0;

            double result = a / b;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Because division by Zero is not defined in Mathematics");
        }
    }

    public static void main(String[] args) {
        aithmeticException();
    }
}
