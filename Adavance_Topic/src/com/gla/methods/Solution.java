package com.gla.methods;

public class Solution {

    public static void area(double radius) {
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println(areaOfCircle);
    }
    public void circum(double radius){
        double result = 2 * Math.PI * radius;
        System.out.println(result);
    }

   public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.area(10);
        s1.circum(10);
    }
}
