package com.onePieceOfCode.paulAndMark.day10_collections_framework.linkedList;

import java.util.LinkedList;

public class EmployeeServiceImplLinkedList {

    private LinkedList<EmployeeLinkedList> employeeLinkedLists ;

    public EmployeeServiceImplLinkedList() {
        employeeLinkedLists =   new LinkedList<>();
    }

    //add
    public void addEmployee(EmployeeLinkedList employee){
        employeeLinkedLists.add(employee);
    }

    //add method to the first element
    public void addEmployeeToFirstElement(EmployeeLinkedList employee){
        employeeLinkedLists.addFirst(employee);
    }

    //add method to the last element
    public void addEmployeeToLastElement(EmployeeLinkedList employee){
        employeeLinkedLists.addLast(employee);
    }

    //get first element
    public EmployeeLinkedList getFirstElement(){
       return employeeLinkedLists.getFirst();
    }

    //get the last element
    public EmployeeLinkedList getLastElement(){
        return employeeLinkedLists.getLast();
    }

    //remove the first element
    public EmployeeLinkedList removeFirstElement(){
        return employeeLinkedLists.removeFirst();
    }

    //remove the last
    public EmployeeLinkedList removeLastElement(){
        return employeeLinkedLists.removeLast();
    }

    //print all of the employees
    public void displayemployees(){
        System.out.println("Current employees: ");
        for(EmployeeLinkedList empl : employeeLinkedLists){
            System.out.println(empl);
        }
    }
}
