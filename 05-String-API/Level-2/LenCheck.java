package com.gla.String;

import java.util.Scanner;

public class LenCheck{

    public static int getLen(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        }catch(Exception e){
        }
        return c;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=getLen(s);
        int b=s.length();
        System.out.println(a);
        System.out.println(b);
    }
}

