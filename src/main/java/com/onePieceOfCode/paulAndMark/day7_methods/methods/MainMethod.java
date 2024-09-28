package com.onePieceOfCode.paulAndMark.day7_methods.methods;

public class MainMethod {
    public static void main(String[] args) {
        displayEmployeeInfo("Mark",30);

        System.out.println();

        //calling method with return value ( calculateSalary )
        double salary = calculateSalary(40, 200.75);
        System.out.println(" 2. Calling methods with return values ( double )");
        System.out.println(" - Weekly Salary: Php " + salary);
        System.out.println();

        System.out.println();

        double bonus = calculateBonus(50000.75, 5);
        System.out.println(" 3. Calling methods with return values ( double, int )");
        System.out.println(" - Salary with Bonus ( double + int ) : " + bonus);
        System.out.println();


        System.out.println(" 3.1 Calling methods with return values ( double, String )");

        System.out.println(" - Salary with Bonus ( double + string ) :" + calculateBonus(50000, "gOoD"));
        System.out.println();

        printDepartment("IT");

    }

    //void method ( no return value )
    public static void displayEmployeeInfo(String name, int age){
        System.out.println(" 1. Void method ( with no return value");
        System.out.println(" - Employee Name: " + name);
        System.out.println(" - Employee Age:" + age);
        System.out.println();
    }

    // method with return value ( double )
    public static double calculateSalary(int hoursWorked, double hourlyRate){
        return hoursWorked * hourlyRate;
    }

   // method overloading ( with return double )
   public static double calculateBonus(double salary, int yearsOfService){
       return salary * yearsOfService;
   }

    public static String calculateBonus(double salary, String performanceRating){

        double bonusPercentage;

        switch (performanceRating){
            case "excellent":
                bonusPercentage = 0.1;
                break;
            case "good":
                bonusPercentage = 0.05;
                break;
            default:
                bonusPercentage = 0.03;
                performanceRating = "average";
        }


        double bonusAmount = salary * bonusPercentage;
        return String.format("The employee got a bonus: Php %.2f ( Performance: %s", bonusAmount, performanceRating);
    }

    //another example of void
    public  static void printDepartment(String department){
        System.out.println(" 4. - Employee Department " + department);
    }
}
