package com.onePieceOfCode.paulAndMark.day5_control_flow.jumpStatements;

public class MainJump {
    public static void main(String[] args) {
        int performanceRating = 2;
        double salary = 50000;

        System.out.println("Performance rating: ");

        switch (performanceRating){
            case 1:
            case 2:
            case 3:
                System.out.println(" Very Poor");
            break;

            case 4:
            case 5:
            case 6:
                System.out.println(" Poor");
                break;
            case 7:
            case 8:
                System.out.println("Good");
                break;
            case 9:
                System.out.println("Very Good");
                break;
            default:
                System.out.println("Excellence");


        }

        System.out.println("2. Salary Increments: ");
        for( int year = 1; year <= 5; year++){
            if (year == 3){
                System.out.println("Skipping year 3 due to policy");
               break;
                //continue
            }
            salary *= 1.05;
            System.out.printf("Year %d: Php %.2f %n ", year, salary);

            /*
                * %.2f = getting the 2 decimal places
                * %d = getting the integer value
                *
             */
        }
    }
}
