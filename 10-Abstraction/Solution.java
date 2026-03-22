package com.gla.Abstraction;

public class Solution {

        public static void main(String[] args) {

            String p = "abc12345";

            if (Sec.check(p)) {
                System.out.println("Strong");
            } else {
                System.out.println("Weak");
            }
        }
    }

