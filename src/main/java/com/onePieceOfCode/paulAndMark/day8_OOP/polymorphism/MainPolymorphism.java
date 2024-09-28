package com.onePieceOfCode.paulAndMark.day8_OOP.polymorphism;

import java.util.logging.Logger;


public class MainPolymorphism {
    public static void main(String[] args) {

        EmployeeInterface fte = new FullTimeEmployeePoly("Mark", 101, 70000.75, 25000.75);
        fte.displayInfo();
        System.out.println();

        EmployeeInterface contractual = new ContractualEmployeePoly("Nan", 201, 40000.75, 3000, 12);
        contractual.displayInfo();

        Logger logger;
        System.out.printf("10%%");




    }
}
