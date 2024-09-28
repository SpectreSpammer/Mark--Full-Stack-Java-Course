package com.onePieceOfCode.paulAndMark.day6_arrays;

public class MainMultiDimensional {
    public static void main(String[] args) {
        Object[][] employeeData = {
                {"Mark", 50000.75, 476.85,  20000.00, 7,true},
                {"Mugi", 65000.75, 276.85,  15000.00, 10,false},
                {"Cobra", 70000.75, 976.85, 4000.00, 5 ,true},
                {"Sabo", 90000.75, 1276.85, 55000.00,3,false},
        };

        //displayEmployeedata(employeeData);


        //applying raise 10% to the employee which has 10 yrs of service
        System.out.println("Applying raise 10% to the employee which has 5 yrs of service");
        for (int i = 0; i < employeeData.length; i++) {
            if ((int)employeeData[i][4] > 5) {
                double originalSalary = (double)employeeData[i][1];
                employeeData[i][1] = (double)employeeData[i][1] * 1.10;
                /*
                    *  %s is a format specifier for strings
                        %.2f is a format specifier for floating-point numbers with 2 decimal places
                        %d is a format specifier for integers
                 */
                System.out.printf("%s received a 10%% raise. Original salary: $%.2f, New salary: $%.2f%n",
                        employeeData[i][0], originalSalary, employeeData[i][1]);
            }
        }

    }

    private static void displayEmployeedata(Object[][] empData){

        for(Object[] employees : empData){
            System.out.println("Employee name: " + employees[0] );
            System.out.printf("Base Salary: Php %.2f %n", (double)employees[1]);
            System.out.printf("Hourly Rates: Php %.2f %n", (double)employees[2]);
            System.out.printf("Bonus: Php %.2f %n", (double)employees[3]);
            System.out.println("years of Service: " + employees[4] );
            System.out.println("Is Late: " + employees[5] );
            System.out.println();


    }
        }

}
