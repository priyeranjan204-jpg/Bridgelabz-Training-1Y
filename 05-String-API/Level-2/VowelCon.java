package com.gla.String;

import java.util.Scanner;

public class VowelCon{

    public static String type(char c){
        if(c>='A'&&c<='Z'){
            c=(char)(c+32);
        }
        if(c>='a'&&c<='z'){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                return "v";
            }else{
                return "c";
            }
        }
        return "n";
    }

    public static int[] count(String s){
        int v=0;
        int c=0;
        for(int i=0;i<s.length();i++){
            String r=type(s.charAt(i));
            if(r.equals("v")){
                v++;
            }
            if(r.equals("c")){
                c++;
            }
        }
        return new int[]{v,c};
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] r=count(s);
        System.out.println("Vowels "+r[0]);
        System.out.println("Consonants "+r[1]);
    }
}
