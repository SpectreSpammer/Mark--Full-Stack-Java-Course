package com.onePieceOfCode.paulAndMark.day5_control_flow.day6_arrays.accessingAndModifying;

import java.util.logging.Logger;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        String [] employeeNames = {"zoro","sanji","nami","chopper"};
        double[] baseSalary = {40000,50000,60000,70000};
        int[] yearsOfService = {6,8,3,9};
        boolean[] isLate = {true,false,true,false};

        //Accessing
        System.out.println(" 1. Employee Data");
        for(int i=0; i< employeeNames.length; i++){
            System.out.println("Employee: " + employeeNames[i]);
            System.out.println("Salary Php: " + baseSalary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Late : " + isLate[i]);
            System.out.println();

        }

        //Modifying
        System.out.println("2. 10% raise for the employee who has 5 yrs of service");
        for(int i =0; i < yearsOfService.length;i++){
            // index
            double originalSalary = baseSalary[i];
            baseSalary[i] *= 1.10;
            System.out.printf("%s received a 10%% raise, Original Salary: Php %.2f, New Salary %.2f %n",
                                employeeNames[i],originalSalary,  baseSalary[i]);
            System.out.println();
        }


    }

}
