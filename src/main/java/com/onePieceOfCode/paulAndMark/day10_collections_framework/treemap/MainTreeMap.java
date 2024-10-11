package com.onePieceOfCode.paulAndMark.day10_collections_framework.treemap;

public class MainTreeMap {
    public static void main(String[] args) {

        EmployeeServiceImplTreeMap employees = new EmployeeServiceImplTreeMap();

        //CREATE
        employees.addEmployee(new EmployeeTreeMap(3,"Mark","Security"));
        employees.addEmployee(new EmployeeTreeMap(1,"Nan","IT"));
        employees.addEmployee(new EmployeeTreeMap(5,"Nami","PR"));
        employees.addEmployee(new EmployeeTreeMap(2,"Anthony","Sales"));
        employees.addEmployee(new EmployeeTreeMap(4,"Robin","Marketing"));

        //READ
        System.out.println("Printing all of the employees by Id:");
        employees.displayAllEmployees();
        System.out.println();

        //check employee by id
        int checkId = 7;
        System.out.println("Does employee " + checkId + " exist? " + employees.isEmployeeExist(checkId));
        System.out.println();

        //get first
        System.out.println("First employee by Id: " + employees.getFirstEmployee());
        System.out.println();

        //get last
        System.out.println("Last employee by Id: " + employees.getLastEmployee());

        System.out.println();
        //UPDATE
        employees.updateEmployee(7,"Mark","Head of Security");
        System.out.println("After updating the employeee");
        employees.displayAllEmployees();
        System.out.println();
        //DELETE
        int idToDelete = 2;
        employees.removeEmployee(idToDelete);
        System.out.println("After removing employee: " + idToDelete);
        employees.displayAllEmployees();

        //total of whole employees
        System.out.println("Total number of employees " + employees.getTotalEmployees());





    }
}
