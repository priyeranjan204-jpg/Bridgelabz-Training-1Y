package com.gla.LeetCode;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution_283 {
    public void movingZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[]={1,0,2,0,3,0};
        Solution_283 s1=new Solution_283();
        s1.movingZeroes(nums);
     for(int i = 0;i < nums.length;i++)  {
         System.out.print(nums[i]+" ");
     }
    }
}