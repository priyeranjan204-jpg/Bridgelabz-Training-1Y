package com.gla.Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class PracticeOfArray {
    public void sortArray() {
        int arr[] = {10, 12, 9, 25, 62, 18};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Sorted array is: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        PracticeOfArray p = new PracticeOfArray();
        p.sortArray();
    }
}
