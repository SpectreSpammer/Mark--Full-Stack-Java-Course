package com.onePieceOfCode.paulAndMark.day10_collections_framework.hashmap;

public class MainHashMap {
    public static void main(String[] args) {
        EmployeeServiceImplHashMap employee = new EmployeeServiceImplHashMap();

        //adding of employees
        employee.addEmployee(new EmployeeHashMap(3,"Mark","Finance"));
        employee.addEmployee(new EmployeeHashMap(5,"Nan","IT"));
        employee.addEmployee(new EmployeeHashMap(1,"Anthony","Security"));
        employee.addEmployee(new EmployeeHashMap(4,"Robin","Marketing"));
        employee.addEmployee(new EmployeeHashMap(2,"Nami","PR"));

        System.out.println("Printing all of the employees");
        employee.displayAllEmployees();
        System.out.println();

        System.out.println("Getting an employee by Id");
        int searchById = 4;
        EmployeeHashMap emp = employee.getEmployeeById(searchById);
        System.out.println("Employee with an Id: " + searchById + " : " + emp);
        System.out.println();

        System.out.println("Updating employee by id");
        employee.updateEmployeeById(5, "naaan", "development");
        System.out.println("After updating the employee 5");
        employee.displayAllEmployees();

        System.out.println("Removing employee by id");
        int removeId = 1;
        employee.removeEmployeeById(removeId);
        System.out.println("After removing the employee 1");
        employee.displayAllEmployees();

        System.out.println(" Check if the employee 4 is exist");
        int checkId = 10;
        System.out.println("Does employee " + checkId + " exist? " + employee.hasEmployee(10));
        System.out.println();

        System.out.println();
        System.out.println("Total number of employees: " + employee.getEmployeeCount());
    }
}
