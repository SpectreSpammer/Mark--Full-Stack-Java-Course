package com.onePieceOfCode.paulAndMark.day5_control_flow;

public class Main {
    public static void main(String[] args) {

        String employeeName = "Paul";
        int yearsOfService = 15;

        int age = 20;



        System.out.println("Employee Name: " + employeeName);

        switch(yearsOfService){
            case 1:
            case 2:
            case 3:
                System.out.println("Employee level: Junior");
                break;

            case 4:
            case 5:
            case 6:
                System.out.println("Employee level: Intermediate");
                break;

            case 7:
            case 8:
            case 9:
                System.out.println("Employee level: Intermediate");
                break;

            default:
                System.out.println("Employee level: Expert");
                break;

        }
    }
}
