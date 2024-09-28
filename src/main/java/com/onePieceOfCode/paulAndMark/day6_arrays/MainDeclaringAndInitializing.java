package com.onePieceOfCode.paulAndMark.day6_arrays;

public class MainDeclaringAndInitializing {
    public static void main(String[] args) {
       String [] employeeNames = {"Mark","Mugi","Cobra"};

       //print out employeeNames
        for(String empNames : employeeNames){
            System.out.println("Employee names: " + empNames);
        }

        double [] hourlyRates = {200.75, 476.85, 980.45 };

        for( double rates : hourlyRates){
            System.out.println("Rates: " + rates);
        }
    }
}
