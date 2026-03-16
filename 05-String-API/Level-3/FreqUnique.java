package com.gla.String;

import java.util.Scanner;

public class FreqUnique{

    public static char[] unique(String s){
        char[] t=new char[s.length()];
        int k=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            boolean f=true;
            for(int j=0;j<i;j++){
                if(s.charAt(j)==c){
                    f=false;
                    break;
                }
            }
            if(f){
                t[k]=c;
                k++;
            }
        }
        char[] r=new char[k];
        for(int i=0;i<k;i++){
            r[i]=t[i];
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] f=new int[256];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)]++;
        }
        char[] u=unique(s);
        for(int i=0;i<u.length;i++){
            System.out.println(u[i]+" "+f[u[i]]);
        }
    }
}

