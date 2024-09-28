package com.onePieceOfCode.paulAndMark.day8_OOP.inheritance;

public class EmployeeInheritance {
    protected String name;
    protected int id;
    protected double salary;

    public EmployeeInheritance(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public double calculateSalary(){
        return salary;
    }

    public void displayEmployeeInfo(){
        System.out.println("Employee Id " + id);
        System.out.println("Employee Name " + name);
        System.out.println("Employee Salary " + salary);
        System.out.println("Total Salary " + calculateSalary());

    }
}
