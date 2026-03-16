package com.gla.Arrays;

import java.util.Arrays;


public class ExtraClass { //Sorting of an array
    public int[] linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new int[]{i};
            }

        }
        return new int[]{-1};

    }

    public static void main(String[] args) {
        ExtraClass e = new ExtraClass();
        int[] arr = {1,2,3,4,5,6};
      int target = 1;
      int[] result = e.linearSearch(arr, target);
        System.out.println("Linear Searching:- " + Arrays.toString(result));
    }
}
