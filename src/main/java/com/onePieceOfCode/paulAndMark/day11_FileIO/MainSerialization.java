package com.onePieceOfCode.paulAndMark.day11_FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {
    public static void main(String[] args) {

        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());
        EmployeeFileIO employee = new EmployeeFileIO();
        employee.name = "Monkey D Luffy";
        employee.address = "East Blue";


        try{
            FileOutputStream fileOutput = new FileOutputStream("C:\\Users\\MUGIWARA\\Downloads\\One Piece of Java Tutorial\\Employee File Output.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(employee);
            objectOutput.close();
            fileOutput.close();
            System.out.println("Serialized data is saved in Employee File out.txt");
            LOGGER.info("The file has been created as Employee File Output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
