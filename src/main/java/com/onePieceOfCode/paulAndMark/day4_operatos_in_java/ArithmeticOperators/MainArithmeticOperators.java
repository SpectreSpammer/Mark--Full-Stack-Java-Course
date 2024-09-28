package com.onePieceOfCode.paulAndMark.day4_operatos_in_java.ArithmeticOperators;

public class MainArithmeticOperators {
    public static void main(String[] args) {

        String employeeName = "luffy";
        double salary = 50000;
        double hourlyRate = 500.75;
        int hoursOfWork = 8;
        double bonus = 25000;
        int  yearsOfExperience = 5;
        double governmentTax = 5000;

        System.out.println("Employee Name: " + employeeName);

        //Addition +
        double totalPay =  salary + bonus;
        System.out.println("1. Addition");
        System.out.println("   - Total Pay: " + totalPay);

        //subtraction -
        double govTax = totalPay - governmentTax;
        System.out.println("2. Subtraction");
        System.out.println("   - With Deduction: " + govTax );

        //multiplication *
        double dailyIncome = hourlyRate * hoursOfWork;
        System.out.println("3. Multiplication");
        System.out.println("   - Daily Income: " + dailyIncome);


        //division /
        double annualIncreaseIncome = salary / yearsOfExperience;
        System.out.println("4. Division");
        System.out.println("  - Annual Increase Salary Php " + annualIncreaseIncome);

        // modulus %
        int nextPayRaise = 365 % 90;
        System.out.println("5. Modulus");
        System.out.println("   - Days until your next pay raise " + nextPayRaise );


    }
}
