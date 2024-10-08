package com.onePieceOfCode.paulAndMark.day9_exceptions.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedException {

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        new Scanner(file);
    }

    public static void connectToDatabase(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sampleDb","admin","admin");
        }catch (SQLException sqlException){
            System.out.println("Database connection failed: " + sqlException.getMessage());
        }finally {
            System.out.println("Close the database");
        }
    }
}
