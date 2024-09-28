package com.onePieceOfCode.paulAndMark.day8_OOP.abstraction;

public class PartTimeEmployee extends EmployeeAbstraction{

    private int hoursWorked;
    private double overTimePay;

    public PartTimeEmployee(String name, int id, double salary,int hoursWorked, double overTimePay) {
        super(name, id, salary);
        this.hoursWorked = hoursWorked;
        this.overTimePay = overTimePay;
    }


    @Override
    double calculateSalary() {
        return salary + ( hoursWorked * overTimePay);
    }


}
