package com.onePieceOfCode.paulAndMark.day6_arrays;

public class MainAccessingAndModifying {
    public static void main(String[] args) {
        String [] employeeNames = {"Mark","Mugi","Cobra","Sabo"};
        double [] hourlyRates = {200.75, 476.85, 980.45, 1250.75 };
        int [] yearsOfService = {5,7,11,13};
        double [] salary = {50000.0, 60000.0,70000,9000};
        boolean [] isLate = {false,true,true,false};

        //print out employeeNames
        for(String empNames : employeeNames){
            System.out.println("Employee names: " + empNames);
        }
        System.out.println();

        //applying raise 10% to the employee which has 10 yrs of service
        System.out.println("Applying raise 10% to the employee which has 10 yrs of service");
        for(int i=0; i < yearsOfService.length;i++){
            if( yearsOfService[i] > 10){
                double originalSalary = salary[i];
                salary[i] *= 1.10;
                System.out.printf(" %s received a 10%% raise. Original salary: Php %.2f, New Salary Php: %.2f %n",
                                    employeeNames[i],originalSalary,salary[i]);

            }
        }

        System.out.println();
        //salary deduction of 10% for every late
        System.out.println("Salary deduction of 10% for every late");
        for(int i=0; i < employeeNames.length;i++){
            if(isLate[i]){
                double originalSalary = salary[i];
                salary[i] -= 1.10;
                System.out.printf(" %s was late. Original Salary Php %.2f, New Salary after deduction: Php %.2f \n" ,
                        employeeNames[i],originalSalary,salary[i]);
            }
        }



    }
}
