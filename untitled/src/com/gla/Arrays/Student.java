package com.gla.Arrays;

import java.util.*;

public class Student {

    int age;
    int rollNo;
    String name;

    public void printInfo()
    {
        System.out.println("Name :- "+name);
        System.out.println("Roll No :- "+rollNo);
        System.out.println("Age :- "+age);
    }
    public static void main(String[] args) {
        Student s1=new Student();
        s1.age=12;
        s1.rollNo=1;
        String name1=s1.name="Ram";
        Student s2 = new Student();
        s2.age=20;
        s2.rollNo=2;
        String name2=s2.name="Sham";
        s1.printInfo();
        s2.printInfo();
    }
}

