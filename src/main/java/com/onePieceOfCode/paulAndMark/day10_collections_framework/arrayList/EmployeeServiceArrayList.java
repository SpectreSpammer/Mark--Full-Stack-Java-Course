package com.onePieceOfCode.paulAndMark.day10_collections_framework.arrayList;

import java.util.ArrayList;

public class EmployeeServiceArrayList {
    private ArrayList<EmployeeArrayList> employeeList;

    public EmployeeServiceArrayList() {
        employeeList = new ArrayList<>();
    }

    public void addEmployee(EmployeeArrayList employee){
        employeeList.add(employee);
    }

    public void addEmployeeByIndex(int index, EmployeeArrayList addEmployee){
        employeeList.add(index,addEmployee);
    }

    public EmployeeArrayList getEmployeByIndex(int getByIndex){
        return employeeList.get(getByIndex);
    }

    public void updateEmployeeByIndex(int index, EmployeeArrayList updateEmployee){
        employeeList.set(index,updateEmployee);
    }

    public EmployeeArrayList removeEmployeeByIndex(int getByIndex){
        return employeeList.remove(getByIndex);
    }

    public int getTotalOfEmployees(){
        return employeeList.size();
    }

    public boolean isEmpty(){
        return employeeList.isEmpty();
    }

    public void printAllEmployees(){
        for(EmployeeArrayList emp : employeeList){
            System.out.println(emp);
        }
    }





}
