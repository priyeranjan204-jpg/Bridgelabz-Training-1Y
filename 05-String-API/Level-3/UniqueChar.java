package com.gla.String;

import java.util.Scanner;

public class UniqueChar{

    public static int len(String s){
        int c=0;
        try{
            while(true){
                s.charAt(c);
                c++;
            }
        }catch(Exception e){}
        return c;
    }

    public static char[] unique(String s){
        int n=len(s);
        char[] t=new char[n];
        int k=0;
        for(int i=0;i<n;i++){
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
        char[] r=unique(s);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i]+" ");
        }
    }
}
