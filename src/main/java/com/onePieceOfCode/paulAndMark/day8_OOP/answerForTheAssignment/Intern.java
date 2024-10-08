package com.onePieceOfCode.paulAndMark.day8_OOP.answerForTheAssignment;

public class Intern extends EmployeeAbstract implements Trainable {
    public Intern(String name, int id, double baseSalary, String department) {
        super(name, id, baseSalary,department);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 0.5; // 50% of base salary
    }

    @Override
    public void attendTraining() {
        System.out.println(name + " is attending an orientation session.");
    }
}
