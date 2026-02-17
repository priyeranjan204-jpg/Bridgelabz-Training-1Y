package com.gla.String;

import java.util.Scanner;

public class CharArrayCheck{
    public static char[] getChars(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }

    public static boolean check(char[] a,char[] b){
        if(a.length!=b.length){
            return false;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        char[] a1=getChars(text);
        char[] a2=text.toCharArray();
        boolean result=check(a1,a2);
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]);
        }
        System.out.println();
        for(int i=0;i<a2.length;i++){
            System.out.print(a2[i]);
        }
        System.out.println();
        System.out.println(result);
    }
}
