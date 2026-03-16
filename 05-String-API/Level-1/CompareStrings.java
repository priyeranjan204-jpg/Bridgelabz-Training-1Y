package com.gla.String;

import java.util.Scanner;

public class CompareStrings{
    public static boolean match(String a,String b){
        int n=a.length();
        int m=b.length();
        if(n!=m){
            return false;
        }
        int i=0;
        while(i<n){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        boolean x=match(s1,s2);
        boolean y=s1.equals(s2);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);
    }
}

