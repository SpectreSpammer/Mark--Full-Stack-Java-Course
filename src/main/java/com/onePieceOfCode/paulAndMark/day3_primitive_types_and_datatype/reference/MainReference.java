package com.onePieceOfCode.paulAndMark.day3_primitive_types_and_datatype.reference;

public class MainReference {
    public static void main(String[] args) {

        //creating the objects of the interface
        Employee manager = new Manager();
        Employee developer = new Developer();
        Employee designer = new Designer();

        //array of employee
        Employee[] employees = { manager,designer, developer };

        //foreach of employee
        for(Employee employee : employees){
            employee.work();
            employee.takeBreak();
            employee.attendMeeting();
            System.out.println();
        }
    }
}
