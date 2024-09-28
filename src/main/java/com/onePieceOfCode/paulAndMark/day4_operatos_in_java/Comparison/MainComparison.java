package com.onePieceOfCode.paulAndMark.day4_operatos_in_java.Comparison;

public class MainComparison {

    public static void main(String[] args) {

        String employeeName = "luffy";
        double salary = 50000;
        double hourlyRate = 500.75;
        int hoursOfWork = 8;
        double bonus = 25000;
        int  yearsOfExperience = 5;
        double governmentTax = 5000;


        System.out.println("Employee name " + employeeName);

        // equals == -> years of experice
        if(yearsOfExperience == 10){
            System.out.println("1. Luffy has been received pention because he reach 1 decade in the company");
        }else {
            System.out.println("1. Luffy has not reach 1 decade in the company");
        }

        // not equals !=
        if(salary != 50000){
            System.out.println("2. Luffy is not Php 100000");
        }else {
            System.out.println("2. Luffy base salary is 50000");
        }

        // greater than >
        if(hoursOfWork > 9){
            System.out.println("3. Luffy take his overtime");
        }
        else {
            System.out.println("3. Luffy does not take his overtime");
        }

        // less than <
        if(hourlyRate < 1000){
            System.out.println("4. Luffy is underpaid in his job");
        }else {
            System.out.println("4. Luffy is well paid in his company");
        }

        // >=
        double totalSalary = salary + bonus;
        if(totalSalary >= 200000){
            System.out.println("5. Luffy is part of the executives");
        }else{
            System.out.println("5. Luffy is not part of the executives");
        }

        //  less than <
        if(yearsOfExperience <= 10){
            System.out.println("6. Luffy is with in the company for 10 years");
        }else {
            System.out.println("6. Luffy is with in the company for less than 10 years");
        }


    }
}
