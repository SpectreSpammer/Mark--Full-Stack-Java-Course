package com.onePieceOfCode.paulAndMark.day8_OOP.inheritance;

public class MainInherintance {
    public static void main(String[] args) {

        EmployeeInheritance regularEmployee = new EmployeeInheritance("Mark", 101, 50000.75);
        FullTimeEmployeeInheritance fte = new FullTimeEmployeeInheritance("Nan", 201,60000.75, 25000.75);
        PartTimeEmployeeInheritance partTime = new PartTimeEmployeeInheritance("mugi", 301,25000.75, 10,5000.75);


        System.out.println("Regular Employee:");
        regularEmployee.displayEmployeeInfo();
        regularEmployee.calculateSalary();
        System.out.println();
        System.out.println("Full Time Employee:");
        fte.displayEmployeeInfo();
        fte.calculateSalary();
        System.out.println();
        System.out.println("Part Time Employee:");
        partTime.displayEmployeeInfo();
        partTime.calculateSalary();
    }
}
