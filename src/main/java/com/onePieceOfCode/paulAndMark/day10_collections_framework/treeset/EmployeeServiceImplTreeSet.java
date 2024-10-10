package com.onePieceOfCode.paulAndMark.day10_collections_framework.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeServiceImplTreeSet {

    private TreeSet<EmployeeTreeSet> employees;

    public EmployeeServiceImplTreeSet() {
        employees = new TreeSet<>();
    }

    public EmployeeServiceImplTreeSet(Comparator<EmployeeTreeSet> comparator) {
       employees = new TreeSet<>(comparator);
    }

    public boolean addEmployee(EmployeeTreeSet employee){
        return employees.add(employee);
    }

    public boolean removeEmployee(EmployeeTreeSet employee){
        return employees.remove(employee);
    }

    public boolean containsEmployee(EmployeeTreeSet employee){
        return employees.contains(employee);
    }

    public void printEmployee(){
        System.out.println("Current employes (sorted)");
        for(EmployeeTreeSet emp : employees){
            System.out.println(emp);
        }
    }

    public EmployeeTreeSet getFirstEmployee(){
        return employees.first();
    }


    public EmployeeTreeSet getLastEmployee() {
        return employees.last();
    }
}
