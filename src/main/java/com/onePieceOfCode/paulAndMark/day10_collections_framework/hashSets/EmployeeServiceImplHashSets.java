package com.onePieceOfCode.paulAndMark.day10_collections_framework.hashSets;

import com.onePieceOfCode.paulAndMark.day10_collections_framework.linkedList.EmployeeLinkedList;

import java.util.HashSet;

public class EmployeeServiceImplHashSets {
    HashSet<EmployeeHashSets> employeeHashSets;

    public EmployeeServiceImplHashSets() {
        employeeHashSets = new HashSet<>();
    }

    //add
    public boolean addEmployee(EmployeeHashSets employee){
        return employeeHashSets.add(employee);
    }

    //remove
    public boolean removeEmployee(EmployeeHashSets employee){
        return employeeHashSets.remove(employee);
    }

    //validate if the object exist or contains the object
    public boolean containsEmployee(EmployeeHashSets employee){
        return employeeHashSets.contains(employee);
    }

    //print all of employees
    public void displayEmployees(){
        System.out.println("Current employees: ");
        for(
                EmployeeHashSets empl : employeeHashSets){
            System.out.println(empl);
    }

    }
    //counting the size of the employees
    public int getEmployeeSize(){
        return employeeHashSets.size();
    }

}
