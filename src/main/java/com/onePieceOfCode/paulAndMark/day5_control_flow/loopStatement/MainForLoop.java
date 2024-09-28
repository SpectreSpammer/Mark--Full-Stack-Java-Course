package com.onePieceOfCode.paulAndMark.day5_control_flow.loopStatement;

public class MainForLoop {
    public static void main(String[] args) {

        String employeeName = "Paul";
        double baseSalary = 50000;
        int yearsOfService = 6;

        System.out.println("Employee " + employeeName);
        System.out.println("Salary " + baseSalary);
        System.out.println("Years of service " + yearsOfService);

        //projecting salary for the next 5 years
        System.out.println("Salary progression for the next 5 years");
        double annualRaisePercentage = 0.05;

        for(int years = 1; years <=5;years++){
            baseSalary*=(1+annualRaisePercentage);

            yearsOfService++;

            System.out.printf("Year %d - Salary: Php: %.2f, Years of Service %d %n",
                              years,      baseSalary,           yearsOfService);

        }
    }
}
