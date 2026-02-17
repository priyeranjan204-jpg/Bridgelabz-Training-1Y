package com.gla.String;


    import java.util.Scanner;

    public class SplitCheck{

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

        public static boolean check(String[] a,String[] b){
            if(a.length!=b.length){
                return false;
            }
            for(int i=0;i<a.length;i++){
                if(!a[i].equals(b[i])){
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String[] a=splitText(s);
            String[] b=s.split(" ");
            boolean r=check(a,b);
            System.out.println(r);
        }
    }


