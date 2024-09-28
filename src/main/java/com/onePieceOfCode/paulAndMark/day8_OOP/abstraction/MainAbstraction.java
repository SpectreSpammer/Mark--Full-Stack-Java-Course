package com.onePieceOfCode.paulAndMark.day8_OOP.abstraction;

public class MainAbstraction {

    public static void main(String[] args) {
        EmployeeAbstraction fulltime = new FullTimeEmployee("Mark", 101, 50000.75, 25000.75);
        EmployeeAbstraction partTime = new PartTimeEmployee("Mugi", 102, 60000, 10, 5000.75);

        fulltime.displayEmployeeInfo();
        System.out.println("Total Salary for Fulltime: " + fulltime.calculateSalary());
        System.out.println();
        partTime.displayEmployeeInfo();
        System.out.println("Total Salary for PartTime: " + partTime.calculateSalary());
    }


}
