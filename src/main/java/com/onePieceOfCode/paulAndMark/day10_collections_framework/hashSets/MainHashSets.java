package com.onePieceOfCode.paulAndMark.day10_collections_framework.hashSets;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public class MainHashSets {
    public static void main(String[] args) {
        EmployeeServiceImplHashSets empHashSets = new EmployeeServiceImplHashSets();
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("Nan");
        arrayList.add(1);

        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(true);


        EmployeeHashSets emp1 = new EmployeeHashSets(101,"Mark","IT");//101
        EmployeeHashSets emp2 = new EmployeeHashSets(102,"Nan" ,"Sales");//102
        EmployeeHashSets emp3 = new EmployeeHashSets(101,"Mark","IT");//101
        EmployeeHashSets emp4 = new EmployeeHashSets(103, "Nami", "Marketing");
        EmployeeHashSets emp5 = new EmployeeHashSets(104,"Robin", "Human Resources");
        EmployeeHashSets emp6 = new EmployeeHashSets(102,"Nan" ,"Sales");//102

        System.out.println(" ---- Ading employees ---- ");
        System.out.println("Added employee 1: " + empHashSets.addEmployee(emp1));
        System.out.println("Added employee 2: " + empHashSets.addEmployee(emp2));
        System.out.println("Added employee 3: " + empHashSets.addEmployee(emp3));
        System.out.println("Added employee 4: " + empHashSets.addEmployee(emp4));
        System.out.println("Added employee 5: " + empHashSets.addEmployee(emp5));
        System.out.println("Added employee 6: " + empHashSets.addEmployee(emp6));
        System.out.println();

        empHashSets.displayEmployees();
        System.out.println();

        System.out.println("Employees count: " + empHashSets.getEmployeeSize());
        System.out.println();

        System.out.println("Checking if the employee is exist");
        System.out.println("Contains emp1: " + empHashSets.containsEmployee(emp1));
        System.out.println("Contains emp2: " + empHashSets.containsEmployee(emp2));
        System.out.println("Contains emp3: " + empHashSets.containsEmployee(emp3));
        System.out.println("Contains emp4: " + empHashSets.containsEmployee(emp4));
        System.out.println("Contains emp5: " + empHashSets.containsEmployee(emp5));
        System.out.println("Contains emp6: " + empHashSets.containsEmployee(emp6));
        System.out.println();

        System.out.println("Removed emp2: " + empHashSets.removeEmployee(emp1));
        empHashSets.displayEmployees();

        System.out.println();
        System.out.println("Employee Hashcode emp1: " + emp1.hashCode());
        System.out.println("Employee Hashcode emp2: " + emp2.hashCode());
        System.out.println("Employee Hashcode emp3: " + emp3.hashCode());
        System.out.println("Employee Hashcode emp4: " + emp4.hashCode());
        System.out.println("Employee Hashcode emp5: " + emp5.hashCode());
        System.out.println("Employee Hashcode emp6: " + emp6.hashCode());


    }
}
