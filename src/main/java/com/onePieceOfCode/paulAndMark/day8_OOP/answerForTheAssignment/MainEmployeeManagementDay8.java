package com.onePieceOfCode.paulAndMark.day8_OOP.answerForTheAssignment;

public class MainEmployeeManagementDay8 {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Adding employees using different methods
        manager.addEmployee(new Manager("John Doe", 1, 5000)); //EmployeeAbstract object
        manager.addEmployee("Jane Smith", 2, 3000, "Developer"); //with department
        manager.addEmployee("Bob Johnson", 3, 2000); // with 3 params

        //Getting All Manager objects
        System.out.println("All Employees from manager");
        for (EmployeeAbstract emp : manager.getAllEmployees()) {
            emp.displayInfo();

        }
        System.out.println();  // Add a blank line for readability

        // Demonstrating polymorphism
        EmployeeAbstract[] employees = {
                new Manager("Alice Williams", 4, 6000),
                new Developer("Charlie Brown", 5, 4000),
                new Intern("David Lee", 6, 2500,"gdfgdfgdfgdf")
        };

        System.out.println("Employee Information:");
        for (EmployeeAbstract emp : employees) {
            manager.displayEmployeeInfo(emp);
            if (emp instanceof Trainable) {
                ((Trainable) emp).attendTraining();
            }
            System.out.println();
        }

        // Demonstrating other EmployeeManager methods
        System.out.println("Removing employee with ID 2");
        manager.removeEmployee(5);


        System.out.println("Getting employee with ID 1:");
        EmployeeAbstract emp = manager.getEmployee(5);
        if (emp != null) {
            manager.displayEmployeeInfo(emp);
        } else {
            System.out.println("Employee not found.");
        }
    }
}
