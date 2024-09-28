package com.onePieceOfCode.paulAndMark.day5_control_flow.loopStatement;

public class MainDoWhile {
    public static void main(String[] args) {

        /*
            *Do this first
            * before validation
         */
        int trainingModules = 3;

        System.out.println("Training modules:");
        do{
            trainingModules++;
            //trainingModules 7 + 1
            System.out.println("Completed Module " + trainingModules);
        }while(trainingModules < 5);

        System.out.println("All required modules has been completed");
    }
}
