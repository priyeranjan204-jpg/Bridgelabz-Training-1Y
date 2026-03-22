package com.gla.Inheritance;

public class Solution {
        public static void main(String[] args) {

            Order o1 = new Order(1, "20-03");
            Order o2 = new Ship(2, "21-03", "TR123");
            Order o3 = new Del(3, "22-03", "TR456", "25-03");

            System.out.println(o1.status());
            System.out.println(o2.status());
            System.out.println(o3.status());
        }
    }

