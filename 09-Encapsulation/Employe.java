package com.gla.encapsulation;

public class Employe {

    private int id = 1;
    private double salary = 85000;
    private String name = "Priyeranjan";

    public int getId()
    {
        return id;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getName()
    {
        return name;
    }

   public static void main(String[] args) {
        Employe e1= new Employe();
       System.out.println("Id:-"+ e1.getId() + "Salary:-"+ e1.getSalary() + "Name:-"+e1.getName());
    }
}
