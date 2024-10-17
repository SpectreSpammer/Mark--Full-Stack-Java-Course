package com.onePieceOfCode.paulAndMark.day11_FileIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserialization {
    public static void main(String[] args) {

        EmployeeFileIO employee = null;

        try{
            FileInputStream fileInput = new FileInputStream("C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Employee File Output.txt");
            ObjectInputStream inputStream = new ObjectInputStream(fileInput);

            employee = (EmployeeFileIO) inputStream.readObject();
            inputStream.close();
            fileInput.close();

            System.out.println("Deserializing Employee File Output.txt......");
            System.out.println("First Name of Employee: " + employee.name);
            System.out.println("Address of Employee: " + employee.address);

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
