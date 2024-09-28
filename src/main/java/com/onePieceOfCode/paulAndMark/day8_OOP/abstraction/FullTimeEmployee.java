package com.onePieceOfCode.paulAndMark.day8_OOP.abstraction;

public class FullTimeEmployee extends EmployeeAbstraction{

    private double bonus;


    public FullTimeEmployee(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    double calculateSalary() {
        return salary + bonus;
    }
}
