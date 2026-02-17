package com.gla.String;

import java.util.Scanner;

public class FreqNested{

    public static String[] find(String s){
        char[] a=s.toCharArray();
        int[] f=new int[a.length];
        for(int i=0;i<a.length;i++){
            f[i]=1;
            if(a[i]=='0'){
                continue;
            }
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    f[i]++;
                    a[j]='0';
                }
            }
        }
        int c=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!='0'){
                c++;
            }
        }
        String[] r=new String[c];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!='0'){
                r[k]=a[i]+" "+f[i];
                k++;
            }
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] r=find(s);
        for(int i=0;i<r.length;i++){
            System.out.println(r[i]);
        }
    }
}

