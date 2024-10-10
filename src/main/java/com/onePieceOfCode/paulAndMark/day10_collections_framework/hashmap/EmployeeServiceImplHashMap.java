package com.onePieceOfCode.paulAndMark.day10_collections_framework.hashmap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeServiceImplHashMap {
    private HashMap<Integer, EmployeeHashMap> employees;

    public EmployeeServiceImplHashMap() {
       employees = new HashMap<>();
    }

    //add
    public EmployeeHashMap addEmployee(EmployeeHashMap employee){
        return employees.put(employee.getId(),employee);
    }

    //get employee by id
    public EmployeeHashMap getEmployeeById(int id){
        return employees.get(id);
    }

    //remove employee by id
    public EmployeeHashMap removeEmployeeById(int id){
        return employees.remove(id);
    }

    //if the employee exist
    public boolean hasEmployee(int id){
        return employees.containsKey(id);
    }

    //update
    public void updateEmployeeById(int id,String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id, new EmployeeHashMap(id,name,dept));
        }
    }

    //display
    public void displayAllEmployees(){
        for(Map.Entry<Integer,EmployeeHashMap> entry : employees.entrySet()){
            System.out.println("Id: " + entry.getKey() + ", " + entry.getValue());
        }
    }


    //count all of the employees
    public int getEmployeeCount(){
       return employees.size();
    }
}
