package com.onePieceOfCode.paulAndMark.day10_collections_framework.arrayList;

public class MainArrayList {
    public static void main(String[] args) {
        EmployeeServiceArrayList empls = new EmployeeServiceArrayList();

        empls.addEmployee(new EmployeeArrayList(1,"mark","IT"));
        empls.addEmployee(new EmployeeArrayList(2,"nan","Security"));
        empls.addEmployee(new EmployeeArrayList(2,"nan","Security"));
        empls.addEmployee(new EmployeeArrayList(3,"nami","Finance"));
        empls.addEmployee(new EmployeeArrayList(4,"sanji","Kitchen"));
        empls.addEmployeeByIndex(2,new EmployeeArrayList(5,"robin","HR"));

        System.out.println("After adding of employees");
        empls.printAllEmployees();
        System.out.println();
        System.out.println("Updating Employee..................");
        empls.updateEmployeeByIndex(3,new EmployeeArrayList(6,"usopp","PR"));
        empls.printAllEmployees();
        System.out.println();
        System.out.println("Removing Employee..................");
        empls.removeEmployeeByIndex(4);
        empls.printAllEmployees();
        System.out.println();
        System.out.println("Total employees: " + empls.getTotalOfEmployees());
        System.out.println("Is the employee empty? : " + empls.isEmpty());
        System.out.println("Employee at index 2: " + empls.getEmployeByIndex(2));



    }
}
