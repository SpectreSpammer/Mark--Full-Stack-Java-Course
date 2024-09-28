package com.onePieceOfCode.paulAndMark.day8_OOP.abstraction;

public abstract class EmployeeAbstraction {
    protected String name;
    protected int id;
    protected double salary;

    public EmployeeAbstraction(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract double calculateSalary();

    public void displayEmployeeInfo(){
        System.out.println("Employee Id: " + id);
        System.out.println("Employee name: " + name);
        System.out.println("Employee salary: " + salary);
    }
}
