package com.onePieceOfCode.paulAndMark.day4_operatos_in_java.logical;

public class MainLogical {
    public static void main(String[] args) {

        String employeeName = "luffy";
        double salary = 50000;
        double hourlyRate = 500.75;
        int hoursOfWork = 8;
        double bonus = 25000;
        int yearsOfExperience = 10;
        double governmentTax = 5000;

        //&& - both condition are true
        if (hoursOfWork > 40 && salary < 60000) {
            System.out.println("1. Luffy has worked for 40 hrs and her salary is less than 60k");

        } else {
            System.out.println("1. luffy is under time and her base salary is 60k and more");
        }

        // ||
        if (yearsOfExperience > 5 || salary > 100000) {
            System.out.println("2. Luffy is either a long time employee or highly paid");
        } else {
            System.out.println("2. Luffy is neither a long time employee or highly paid");
        }

        if(bonus != yearsOfExperience){
            System.out.println("3. Luffy bonus is not equal to the years of service");
        }else {
            System.out.println("3. Luffy bonus equals to his years of service");
        }
    }
}
