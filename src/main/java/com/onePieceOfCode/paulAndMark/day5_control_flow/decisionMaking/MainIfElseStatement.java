package com.onePieceOfCode.paulAndMark.day5_control_flow.decisionMaking;

public class MainIfElseStatement {
    public static void main(String[] args) {

        double baseSalary = 50000;
        int hoursOfWorked = 50;
        double bonus = 25000;

        // true ==  true
        if( hoursOfWorked > 45 && baseSalary < 70000){
            System.out.println("Mark have worked 40 hrs and his basic salary is less than 60000");
        }else {
            System.out.println("Either Mark is undertime or his basic salary is 60000 or more");
        }
    }
}
