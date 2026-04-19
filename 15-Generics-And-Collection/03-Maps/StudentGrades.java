package com.gla.Map;

import java.util.*;

public class StudentGrades {
    public static void main(String[] args) {

        Map<String, Double> grades = new TreeMap<>();

        grades.put("Ravi", 85.5);
        grades.put("Aman", 90.0);
        grades.put("Neha", 78.0);
        grades.put("Aman", 95.0);
        grades.remove("Neha");
        for (String name : grades.keySet()) {
            System.out.println(name + " : " + grades.get(name));
        }
    }
}
