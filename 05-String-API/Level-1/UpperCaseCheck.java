package com.gla.String;

import java.util.Scanner;

public class UpperCaseCheck{

    public static String convert(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z'){
                c=(char)(c-32);
            }
            r=r+c;
        }
        return r;
    }

    public static boolean check(String a,String b){
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=convert(s);
        String s2=s.toUpperCase();
        boolean ans=check(s1,s2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(ans);
    }
}
