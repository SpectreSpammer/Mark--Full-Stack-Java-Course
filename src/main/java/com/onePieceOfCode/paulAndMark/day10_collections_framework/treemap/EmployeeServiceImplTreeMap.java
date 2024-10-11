package com.onePieceOfCode.paulAndMark.day10_collections_framework.treemap;

import com.onePieceOfCode.paulAndMark.day10_collections_framework.hashmap.EmployeeHashMap;

import java.util.Map;
import java.util.TreeMap;

public class EmployeeServiceImplTreeMap {

    //              KEY,    VALUE
    private TreeMap<Integer,EmployeeTreeMap> employees;

    //no args constructor
    public EmployeeServiceImplTreeMap() {
      employees = new TreeMap<>();
    }

    //add
    public EmployeeTreeMap addEmployee(EmployeeTreeMap employee){
        return employees.put(employee.getId(),employee);
    }

    //get by id
    public EmployeeTreeMap getEmployee(int id){
        return employees.get(id);
    }

    //remove by id
    public EmployeeTreeMap removeEmployee(int id){
        return employees.remove(id);
    }

    //if employee exist
    public boolean isEmployeeExist(int id){
        return employees.containsKey(id);
    }

    //update
    public void updateEmployee(int id,String name, String dept){
        if(employees.containsKey(id)){
            employees.put(id,new EmployeeTreeMap(id,name,dept));
        }
    }


    //display
    public void displayAllEmployees(){
        for(Map.Entry<Integer, EmployeeTreeMap> entry : employees.entrySet()){
            System.out.println("Id: " + entry.getKey() + ", " + entry.getValue());
        }
    }

    //count all the employees
    public int getTotalEmployees(){
        return  employees.size();
    }

    //get first employee
    public EmployeeTreeMap getFirstEmployee(){
        return  employees.firstEntry().getValue();
    }

    //get last employee
    public EmployeeTreeMap getLastEmployee(){
        return  employees.lastEntry().getValue();
    }
}
