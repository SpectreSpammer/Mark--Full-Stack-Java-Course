package com.onePieceOfCode.paulAndMark.day5_control_flow.decisionMaking;

import java.util.Scanner;

public class MainSwitchStatements {

    public static void main(String[] args) {

        String employeeName = "Mark";

        int yearsOfService = 4;


        System.out.println("Employee Name: " + employeeName);

        switch (yearsOfService){
            case 0:
            case 1:
                System.out.println("Employee Level: Trainee");

            case 2:
            case 3:
                System.out.println("Employee Level: Junior");
                break;
            case 4:
            case 5:
                System.out.println("Employee Level: Intermediate");
                break;
            case 6:
            case 7:
                System.out.println("Employee Level: Senior");
                break;
            default:
                System.out.println("Employee Level: Expert");

        }
    }
}
