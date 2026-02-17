package com.gla.String;

import java.util.Scanner;

public class WordLen{

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

    public static String[][] make2D(String[] a){
        String[][] r=new String[a.length][2];
        for(int i=0;i<a.length;i++){
            r[i][0]=a[i];
            r[i][1]=String.valueOf(getLen(a[i]));
        }
        return r;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] a=splitText(s);
        String[][] r=make2D(a);
        for(int i=0;i<r.length;i++){
            int x=Integer.parseInt(r[i][1]);
            System.out.println(r[i][0]+" "+x);
        }
    }
}
