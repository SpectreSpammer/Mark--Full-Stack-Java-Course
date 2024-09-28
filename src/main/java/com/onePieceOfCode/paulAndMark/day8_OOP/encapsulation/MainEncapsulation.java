package com.onePieceOfCode.paulAndMark.day8_OOP.encapsulation;

public class MainEncapsulation {

    public static void main(String[] args) {
        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation("Mark", 101, 50000.75);

        //getters
        System.out.println("Employee Name: " + employeeEncapsulation.getName());
        System.out.println("Employee Id: " + employeeEncapsulation.getId());
        System.out.println("Employee Salary: " + employeeEncapsulation.getSalary());

        //modify object using setter
        employeeEncapsulation.setName("Nan");
        employeeEncapsulation.setSalary(70000.75);

        //invalid salary
        System.out.println();
        employeeEncapsulation.setSalary(-50000.75);
        System.out.println();


        System.out.println();
        employeeEncapsulation.salaryIncreaseByPercentage(-10);
        System.out.println();


        //checking the updated employee
        System.out.println("Updated Employee Name: " + employeeEncapsulation.getName());
        System.out.println("Updated Employee Id: " + employeeEncapsulation.getId());
        System.out.println("Updated Employee Salary: " + employeeEncapsulation.getSalary());

    }



}
