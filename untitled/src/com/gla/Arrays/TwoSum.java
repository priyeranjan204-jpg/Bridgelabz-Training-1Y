package com.gla.Arrays;

import java.util.Arrays;

public class TwoSum { //Two sum in an array

    public int[] twoSum(int num[],int target) {
        for(int i = 0;i < num.length;i++) {
        for(int j = i + 1;j < num.length;j++) {
            if(num[i]+num[j]==target){
                return new int[]{i,j};
            }
        }
        }
        return new int[]{-1};
    }

    public static void main() {
        TwoSum t = new TwoSum();
        int[] num={1,2,3,4,5,6};
        int target = 7;
        int[] result = t.twoSum(num, target);
        System.out.println("TwoSum:- " + Arrays.toString(result));
    }
}
