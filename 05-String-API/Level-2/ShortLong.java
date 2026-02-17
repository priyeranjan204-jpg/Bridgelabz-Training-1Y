package com.gla.String;

import java.util.Scanner;

public class ShortLong{

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

    public static String[] splitText(String s){
        int n=getLen(s);
        int w=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                w++;
            }
        }
        String[] arr=new String[w];
        int start=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                arr[k]=s.substring(start,i);
                k++;
                start=i+1;
            }
        }
        arr[k]=s.substring(start,n);
        return arr;
    }

    public static int[] find(String[] a){
        int min=0;
        int max=0;
        for(int i=1;i<a.length;i++){
            if(getLen(a[i])<getLen(a[min])){
                min=i;
            }
            if(getLen(a[i])>getLen(a[max])){
                max=i;
            }
        }
        return new int[]{min,max};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=splitText(s);
        int[] r=find(a);
        System.out.println("Shortest "+a[r[0]]);
        System.out.println("Longest "+a[r[1]]);
    }
}

