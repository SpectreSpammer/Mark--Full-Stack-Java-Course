package com.onePieceOfCode.paulAndMark.day8_OOP.polymorphism;

public interface EmployeeInterface {
    String getName();
    int getId();
    double salary();
    double calculateSalary();

    default void displayInfo(){
        System.out.println("Employee Id: " + getId());
        System.out.println("Employee Name: " + getName());
        System.out.println("Employee Salary: " + calculateSalary());
    }
}
