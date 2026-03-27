package com.gla.Exception;

import java.util.*;

public class F3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {10, 20, 30};

        try {
            int i = sc.nextInt();
            System.out.println("Value at index " + i + ": " + a[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }
    }
}
