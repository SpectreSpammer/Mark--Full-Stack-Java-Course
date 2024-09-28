package com.onePieceOfCode.paulAndMark.day8_OOP.polymorphism;



public class ContractualEmployeePoly implements EmployeeInterface{

    private String name;
    private int id;
    private double salary;
    private double overTimePay;
    private int workingHours;

    public ContractualEmployeePoly(String name, int id, double salary, double overTimePay, int workingHours) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.overTimePay = overTimePay;
        this.workingHours = workingHours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public double calculateSalary() {
        return salary + (overTimePay * workingHours);
    }


}
