package com.onePieceOfCode.paulAndMark.day5_control_flow.loopStatement;

import java.util.ArrayList;
import java.util.List;

public class MainForEach {
    public static void main(String[] args) {

        String [] employeeNames = {"zoro","sanji","nami","chopper"};

        double[] baseSalary = {40000,50000,60000,70000};
        int[] yearsOfService = {6,8,3,9};

      //printing all employees information

        System.out.println("Employee Information:");
        for(int i = 0; i < employeeNames.length;i++){

            String name = employeeNames[i];
            double salary = baseSalary[i];
            int years = yearsOfService[i];

            System.out.println("Employee: " + name);
            System.out.println("Salary Php: " + salary);
            System.out.println("Years of Service " + years);
            System.out.println();
        }

        System.out.println("List of employees: ");
        for(String name : employeeNames){
            System.out.println(" - " + name);
        }

        List<String> listOfEmployees = List.of("Nan","Mugi","Luffy","Cobra");
        for(String employeeList : listOfEmployees){
            System.out.println("Employees: " + employeeList);
        }


    }
}
