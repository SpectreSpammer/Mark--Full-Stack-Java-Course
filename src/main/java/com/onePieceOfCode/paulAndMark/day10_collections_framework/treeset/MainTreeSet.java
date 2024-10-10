package com.onePieceOfCode.paulAndMark.day10_collections_framework.treeset;

import java.util.Comparator;

public class MainTreeSet {
    public static void main(String[] args) {

        EmployeeServiceImplTreeSet employees = new EmployeeServiceImplTreeSet();
        employees.addEmployee(new EmployeeTreeSet(4,"Robin","Human Resource"));
        employees.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));
        employees.addEmployee(new EmployeeTreeSet(2,"Mark","IT"));
        employees.addEmployee(new EmployeeTreeSet(4,"Nan","Development"));
        employees.addEmployee(new EmployeeTreeSet(1,"Anthony","HR"));
        employees.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));

        employees.addEmployee(new EmployeeTreeSet(2,"Mark","ITs"));

        System.out.println("Employees sorted");
        employees.printEmployee();

        System.out.println();
        System.out.println("First Employee: " + employees.getFirstEmployee());
        System.out.println("First Employee: " + employees.getLastEmployee());
        System.out.println();

        //fetching data based on their name
        EmployeeServiceImplTreeSet empByName = new EmployeeServiceImplTreeSet(
                Comparator.comparing(EmployeeTreeSet::getName)
        );
        empByName.addEmployee(new EmployeeTreeSet(4,"Robin","Human Resource"));
        empByName.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));
        empByName.addEmployee(new EmployeeTreeSet(2,"Mark","IT"));
        empByName.addEmployee(new EmployeeTreeSet(4,"Nan","Development"));
        empByName.addEmployee(new EmployeeTreeSet(1,"Anthony","HR"));
        empByName.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));
        empByName.printEmployee();
        System.out.println();

        //fetching data based on their dept
        EmployeeServiceImplTreeSet empByDept = new EmployeeServiceImplTreeSet(
                Comparator.comparing(EmployeeTreeSet::getDepartment)
        );
        empByDept.addEmployee(new EmployeeTreeSet(4,"Robin","Human Resource"));
        empByDept.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));
        empByDept.addEmployee(new EmployeeTreeSet(2,"Mark","IT"));
        empByDept.addEmployee(new EmployeeTreeSet(4,"Nan","Development"));
        empByDept.addEmployee(new EmployeeTreeSet(1,"Anthony","HR"));
        empByDept.addEmployee(new EmployeeTreeSet(3,"Nami","Marketing"));
        empByDept.printEmployee();



    }
}
