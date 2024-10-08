package com.onePieceOfCode.paulAndMark.day10_collections_framework.linkedList;

public class MainLinkedList {
    public static void main(String[] args) {

        EmployeeServiceImplLinkedList empLinkedList = new EmployeeServiceImplLinkedList();
        empLinkedList.addEmployee(new EmployeeLinkedList(101,"Mark","Finance"));
        empLinkedList.addEmployee(new EmployeeLinkedList(101,"Mark","Finance"));
        empLinkedList.addEmployee(new EmployeeLinkedList(102,"Nan","IT"));
        empLinkedList.addEmployee(new EmployeeLinkedList(103,"Nami","Sales"));
        empLinkedList.addEmployee(new EmployeeLinkedList(104,"Robin","HR"));

        System.out.println(" ---- Adding of Employess ----");
        empLinkedList.displayemployees();
        System.out.println();
        System.out.println("First employee: " + empLinkedList.getFirstElement());
        System.out.println("Last employee: " + empLinkedList.getLastElement());
        System.out.println();
        System.out.println("Removing first employee: " + empLinkedList.removeFirstElement());
        System.out.println("Removing first employee: " + empLinkedList.removeLastElement());
        empLinkedList.displayemployees();



    }
}
