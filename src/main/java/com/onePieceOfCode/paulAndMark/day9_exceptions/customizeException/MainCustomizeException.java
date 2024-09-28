package com.onePieceOfCode.paulAndMark.day9_exceptions.customizeException;

public class MainCustomizeException {
    public static void main(String[] args) throws InvalidRaiseException {
        EmployeeException  emp = new EmployeeException("Mark", 50000.75);


        try{
            //valid raise
            emp.raiseSalary(10);
            System.out.println("10% raise successful");

            //invalid raise
            emp.raiseSalary(-1);
            System.out.println("This line wont be printed out");
        } catch (InvalidRaiseException e) {
            System.out.println("Error: " + e.getMessage());
        }finally {
            System.out.println("Salary processing completed");
        }


        /*
        emp.raiseSalary(10);
        System.out.println("Current Salary: " + emp.getSalary());

        emp.raiseSalary(101);
        System.out.println("This line will not printed out");
        */
    }


}
